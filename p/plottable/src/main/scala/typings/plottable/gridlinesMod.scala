package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.scaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridlinesMod {
  
  @JSImport("plottable/build/src/components/gridlines", "Gridlines")
  @js.native
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  class Gridlines () extends Component {
    def this(xScale: Scale[_, _]) = this()
    def this(xScale: Null, yScale: Scale[_, _]) = this()
    def this(xScale: Scale[_, _], yScale: Scale[_, _]) = this()
    
    var _betweenX: js.Any = js.native
    
    var _betweenY: js.Any = js.native
    
    /* private */ def _redrawXLines(): js.Any = js.native
    
    /* private */ def _redrawYLines(): js.Any = js.native
    
    var _renderCallback: js.Any = js.native
    
    var _xLinesContainer: js.Any = js.native
    
    var _xScale: js.Any = js.native
    
    var _yLinesContainer: js.Any = js.native
    
    var _yScale: js.Any = js.native
    
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
