package typings.plottable

import org.scalablytyped.runtime.TopLevel
import typings.plottable.anon.ValueOf
import typings.plottable.componentMod.Component
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.quantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components/selectionBoxLayer", JSImport.Namespace)
@js.native
object selectionBoxLayerMod extends js.Object {
  
  @js.native
  sealed trait PropertyMode extends js.Object
  @js.native
  object PropertyMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PropertyMode with Double] = js.native
    
    @js.native
    sealed trait PIXEL extends PropertyMode
    /* 1 */ @js.native
    object PIXEL extends TopLevel[PIXEL with Double]
    
    @js.native
    sealed trait VALUE extends PropertyMode
    /* 0 */ @js.native
    object VALUE extends TopLevel[VALUE with Double]
  }
  
  @js.native
  class SelectionBoxLayer () extends Component {
    
    var _adjustBoundsCallback: js.Any = js.native
    
    var _box: SimpleSelection[Unit] = js.native
    
    var _boxArea: js.Any = js.native
    
    var _boxBounds: js.Any = js.native
    
    var _boxVisible: js.Any = js.native
    
    /* private */ def _getBounds(): js.Any = js.native
    
    /* private */ def _getXExtent(): js.Any = js.native
    
    /* private */ def _getYExtent(): js.Any = js.native
    
    /* protected */ def _setBounds(newBounds: Bounds): Unit = js.native
    
    /* protected */ def _setXExtent(xExtent: js.Array[Double | ValueOf]): Unit = js.native
    
    /* protected */ def _setYExtent(yExtent: js.Array[Double | ValueOf]): Unit = js.native
    
    var _xBoundsMode: PropertyMode = js.native
    
    var _xExtent: js.Any = js.native
    
    var _xScale: js.Any = js.native
    
    var _yBoundsMode: PropertyMode = js.native
    
    var _yExtent: js.Any = js.native
    
    var _yScale: js.Any = js.native
    
    /**
      * Sets the Bounds of the box.
      *
      * @param {Bounds} newBounds
      * @return {SelectionBoxLayer} The calling SelectionBoxLayer.
      */
    def bounds(newBounds: Bounds): this.type = js.native
    
    /**
      * Gets whether the box is being shown.
      */
    def boxVisible(): Boolean = js.native
    /**
      * Shows or hides the selection box.
      *
      * @param {boolean} show Whether or not to show the box.
      * @return {SelectionBoxLayer} The calling SelectionBoxLayer.
      */
    def boxVisible(show: Boolean): this.type = js.native
    
    /**
      * Gets the data values backing the left and right edges of the box.
      *
      * Returns an undefined array if the edges are not backed by a scale.
      */
    def xExtent(): js.Array[Double | ValueOf] = js.native
    /**
      * Sets the data values backing the left and right edges of the box.
      */
    def xExtent(xExtent: js.Array[Double | ValueOf]): this.type = js.native
    
    /**
      * Gets the x scale for this SelectionBoxLayer.
      */
    def xScale(): QuantitativeScale[Double | ValueOf] = js.native
    /**
      * Sets the x scale for this SelectionBoxLayer.
      *
      * @returns {SelectionBoxLayer} The calling SelectionBoxLayer.
      */
    def xScale(xScale: QuantitativeScale[Double | ValueOf]): this.type = js.native
    
    /**
      * Gets the data values backing the top and bottom edges of the box.
      *
      * Returns an undefined array if the edges are not backed by a scale.
      */
    def yExtent(): js.Array[Double | ValueOf] = js.native
    /**
      * Sets the data values backing the top and bottom edges of the box.
      */
    def yExtent(yExtent: js.Array[Double | ValueOf]): this.type = js.native
    
    /**
      * Gets the y scale for this SelectionBoxLayer.
      */
    def yScale(): QuantitativeScale[Double | ValueOf] = js.native
    /**
      * Sets the y scale for this SelectionBoxLayer.
      *
      * @returns {SelectionBoxLayer} The calling SelectionBoxLayer.
      */
    def yScale(yScale: QuantitativeScale[Double | ValueOf]): this.type = js.native
  }
}
