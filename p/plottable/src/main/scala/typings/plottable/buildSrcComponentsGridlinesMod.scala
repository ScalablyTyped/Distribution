package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcScalesScaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsGridlinesMod {
  
  @JSImport("plottable/build/src/components/gridlines", "Gridlines")
  @js.native
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  open class Gridlines () extends Component {
    def this(xScale: Scale[Any, Any]) = this()
    def this(xScale: Null, yScale: Scale[Any, Any]) = this()
    def this(xScale: Scale[Any, Any], yScale: Scale[Any, Any]) = this()
    
    /* private */ var _betweenX: Any = js.native
    
    /* private */ var _betweenY: Any = js.native
    
    /* private */ var _redrawXLines: Any = js.native
    
    /* private */ var _redrawYLines: Any = js.native
    
    /* private */ var _renderCallback: Any = js.native
    
    /* private */ var _xLinesContainer: Any = js.native
    
    /* private */ var _xScale: Any = js.native
    
    /* private */ var _yLinesContainer: Any = js.native
    
    /* private */ var _yScale: Any = js.native
    
    /**
      * Gets the between flag for the x axis.
      *
      * @returns {boolean} The current state of betweenX
      */
    def betweenX(): Boolean = js.native
    /**
      * Sets the between flag for the x axis. True causes gridlines to render
      * between ticks. False sets the causes the gridlines to render on the
      * ticks. Defaults to false.
      *
      * @param {boolean} betweenX
      * @returns {Gridlines} The calling Gridlines.
      */
    def betweenX(_betweenX: Boolean): this.type = js.native
    
    /**
      * Gets the between flag for the y axis.
      *
      * @returns {boolean} The current state of betweenY
      */
    def betweenY(): Boolean = js.native
    /**
      * Sets the between flag for the y axis. True causes gridlines to render
      * between ticks. False sets the causes the gridlines to render on the
      * ticks. Defaults to false.
      *
      * @param {boolean} betweenY
      * @returns {Gridlines} The calling Gridlines.
      */
    def betweenY(_betweenY: Boolean): this.type = js.native
  }
}
