package typings
package atPhosphorWidgetsLib.libSplitlayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/splitlayout", "SplitLayout")
@js.native
class SplitLayout protected ()
  extends atPhosphorWidgetsLib.libPanellayoutMod.PanelLayout {
  /**
    * Construct a new split layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: atPhosphorWidgetsLib.libSplitlayoutMod.SplitLayoutNs.IOptions) = this()
  var _alignment: js.Any = js.native
  var _box: js.Any = js.native
  var _dirty: js.Any = js.native
  /**
    * Fit the layout to the total size required by the widgets.
    */
  var _fit: js.Any = js.native
  var _fixed: js.Any = js.native
  var _handles: js.Any = js.native
  var _hasNormedSizes: js.Any = js.native
  var _items: js.Any = js.native
  var _orientation: js.Any = js.native
  var _sizers: js.Any = js.native
  var _spacing: js.Any = js.native
  /**
    * Update the layout position and size of the widgets.
    *
    * The parent offset dimensions should be `-1` if unknown.
    */
  var _update: js.Any = js.native
  /**
    * Get the content alignment for the split layout.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand  to fill the
    * entire split layout.
    */
  /**
    * Set the content alignment for the split layout.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand  to fill the
    * entire split layout.
    */
  var alignment: atPhosphorWidgetsLib.libSplitlayoutMod.SplitLayoutNs.Alignment = js.native
  /**
    * A read-only array of the split handles in the layout.
    */
  val handles: js.Array[stdLib.HTMLDivElement] = js.native
  /**
    * Get the layout orientation for the split layout.
    */
  /**
    * Set the layout orientation for the split layout.
    */
  var orientation: atPhosphorWidgetsLib.libSplitlayoutMod.SplitLayoutNs.Orientation = js.native
  /**
    * The renderer used by the split layout.
    */
  val renderer: atPhosphorWidgetsLib.libSplitlayoutMod.SplitLayoutNs.IRenderer = js.native
  /**
    * Get the inter-element spacing for the split layout.
    */
  /**
    * Set the inter-element spacing for the split layout.
    */
  var spacing: scala.Double = js.native
  /**
    * Move the offset position of a split handle.
    *
    * @param index - The index of the handle of the interest.
    *
    * @param position - The desired offset position of the handle.
    *
    * #### Notes
    * The position is relative to the offset parent.
    *
    * This will move the handle as close as possible to the desired
    * position. The sibling widgets will be adjusted as necessary.
    */
  def moveHandle(index: scala.Double, position: scala.Double): scala.Unit = js.native
  /**
    * Get the relative sizes of the widgets in the layout.
    *
    * @returns A new array of the relative sizes of the widgets.
    *
    * #### Notes
    * The returned sizes reflect the sizes of the widgets normalized
    * relative to their siblings.
    *
    * This method **does not** measure the DOM nodes.
    */
  def relativeSizes(): js.Array[scala.Double] = js.native
  /**
    * Set the relative sizes for the widgets in the layout.
    *
    * @param sizes - The relative sizes for the widgets in the panel.
    *
    * #### Notes
    * Extra values are ignored, too few will yield an undefined layout.
    *
    * The actual geometry of the DOM nodes is updated asynchronously.
    */
  def setRelativeSizes(sizes: js.Array[scala.Double]): scala.Unit = js.native
}

