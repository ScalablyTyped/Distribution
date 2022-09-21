package typings.plottable

import typings.plottable.anon.ValueOf
import typings.plottable.componentMod.Component
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.quantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionBoxLayerMod {
  
  @js.native
  sealed trait PropertyMode extends StObject
  @JSImport("plottable/build/src/components/selectionBoxLayer", "PropertyMode")
  @js.native
  object PropertyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PropertyMode & Double] = js.native
    
    @js.native
    sealed trait PIXEL
      extends StObject
         with PropertyMode
    /* 1 */ val PIXEL: typings.plottable.selectionBoxLayerMod.PropertyMode.PIXEL & Double = js.native
    
    @js.native
    sealed trait VALUE
      extends StObject
         with PropertyMode
    /* 0 */ val VALUE: typings.plottable.selectionBoxLayerMod.PropertyMode.VALUE & Double = js.native
  }
  
  @JSImport("plottable/build/src/components/selectionBoxLayer", "SelectionBoxLayer")
  @js.native
  open class SelectionBoxLayer () extends Component {
    
    /* private */ var _adjustBoundsCallback: Any = js.native
    
    /* protected */ var _box: SimpleSelection[Unit] = js.native
    
    /* private */ var _boxArea: Any = js.native
    
    /* private */ var _boxBounds: Any = js.native
    
    /* private */ var _boxVisible: Any = js.native
    
    /* private */ var _getBounds: Any = js.native
    
    /* private */ var _getXExtent: Any = js.native
    
    /* private */ var _getYExtent: Any = js.native
    
    /* protected */ def _setBounds(newBounds: Bounds): Unit = js.native
    
    /* protected */ def _setXExtent(xExtent: js.Array[Double | ValueOf]): Unit = js.native
    
    /* protected */ def _setYExtent(yExtent: js.Array[Double | ValueOf]): Unit = js.native
    
    /* protected */ var _xBoundsMode: PropertyMode = js.native
    
    /* private */ var _xExtent: Any = js.native
    
    /* private */ var _xScale: Any = js.native
    
    /* protected */ var _yBoundsMode: PropertyMode = js.native
    
    /* private */ var _yExtent: Any = js.native
    
    /* private */ var _yScale: Any = js.native
    
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
