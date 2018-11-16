package typings
package plottableLib.buildSrcComponentsSelectionBoxLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/selectionBoxLayer", "SelectionBoxLayer")
@js.native
class SelectionBoxLayer ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
  var _adjustBoundsCallback: js.Any = js.native
  var _box: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[scala.Unit] = js.native
  var _boxArea: js.Any = js.native
  var _boxBounds: js.Any = js.native
  var _boxVisible: js.Any = js.native
  var _xBoundsMode: PropertyMode = js.native
  var _xExtent: js.Any = js.native
  var _xScale: js.Any = js.native
  var _yBoundsMode: PropertyMode = js.native
  var _yExtent: js.Any = js.native
  var _yScale: js.Any = js.native
  /* private */ def _getBounds(): js.Any = js.native
  /* private */ def _getXExtent(): js.Any = js.native
  /* private */ def _getYExtent(): js.Any = js.native
  /* protected */ def _setBounds(newBounds: plottableLib.buildSrcCoreInterfacesMod.Bounds): scala.Unit = js.native
  /* protected */ def _setXExtent(xExtent: js.Array[scala.Double | plottableLib.Anon_ValueOf]): scala.Unit = js.native
  /* protected */ def _setYExtent(yExtent: js.Array[scala.Double | plottableLib.Anon_ValueOf]): scala.Unit = js.native
  /**
       * Sets the Bounds of the box.
       *
       * @param {Bounds} newBounds
       * @return {SelectionBoxLayer} The calling SelectionBoxLayer.
       */
  def bounds(newBounds: plottableLib.buildSrcCoreInterfacesMod.Bounds): this.type = js.native
  /**
       * Gets whether the box is being shown.
       */
  def boxVisible(): scala.Boolean = js.native
  /**
       * Shows or hides the selection box.
       *
       * @param {boolean} show Whether or not to show the box.
       * @return {SelectionBoxLayer} The calling SelectionBoxLayer.
       */
  def boxVisible(show: scala.Boolean): this.type = js.native
  /**
       * Gets the data values backing the left and right edges of the box.
       *
       * Returns an undefined array if the edges are not backed by a scale.
       */
  def xExtent(): js.Array[scala.Double | plottableLib.Anon_ValueOf] = js.native
  /**
       * Sets the data values backing the left and right edges of the box.
       */
  def xExtent(xExtent: js.Array[scala.Double | plottableLib.Anon_ValueOf]): this.type = js.native
  /**
       * Gets the x scale for this SelectionBoxLayer.
       */
  def xScale(): plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double | plottableLib.Anon_ValueOf] = js.native
  /**
       * Sets the x scale for this SelectionBoxLayer.
       *
       * @returns {SelectionBoxLayer} The calling SelectionBoxLayer.
       */
  def xScale(
    xScale: plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double | plottableLib.Anon_ValueOf]
  ): this.type = js.native
  /**
       * Gets the data values backing the top and bottom edges of the box.
       *
       * Returns an undefined array if the edges are not backed by a scale.
       */
  def yExtent(): js.Array[scala.Double | plottableLib.Anon_ValueOf] = js.native
  /**
       * Sets the data values backing the top and bottom edges of the box.
       */
  def yExtent(yExtent: js.Array[scala.Double | plottableLib.Anon_ValueOf]): this.type = js.native
  /**
       * Gets the y scale for this SelectionBoxLayer.
       */
  def yScale(): plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double | plottableLib.Anon_ValueOf] = js.native
  /**
       * Sets the y scale for this SelectionBoxLayer.
       *
       * @returns {SelectionBoxLayer} The calling SelectionBoxLayer.
       */
  def yScale(
    yScale: plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double | plottableLib.Anon_ValueOf]
  ): this.type = js.native
}

