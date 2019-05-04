package typings
package atPhosphorWidgetsLib.libSplitpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/splitpanel", "SplitPanel")
@js.native
/**
  * Construct a new split panel.
  *
  * @param options - The options for initializing the split panel.
  */
class SplitPanel ()
  extends atPhosphorWidgetsLib.libPanelMod.Panel {
  def this(options: atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.IOptions) = this()
  var _pressData: js.Any = js.native
  /**
    * Get the content alignment for the split panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire split panel.
    */
  /**
    * Set the content alignment for the split panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire split panel.
    */
  var alignment: atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.Alignment = js.native
  /**
    * A read-only array of the split handles in the panel.
    */
  val handles: js.Array[stdLib.HTMLDivElement] = js.native
  /**
    * Get the layout orientation for the split panel.
    */
  /**
    * Set the layout orientation for the split panel.
    */
  var orientation: atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.Orientation = js.native
  /**
    * The renderer used by the split panel.
    */
  val renderer: atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.IRenderer = js.native
  /**
    * Get the inter-element spacing for the split panel.
    */
  /**
    * Set the inter-element spacing for the split panel.
    */
  var spacing: scala.Double = js.native
  /**
    * Handle the `'keydown'` event for the split panel.
    */
  /* private */ def _evtKeyDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the split panel.
    */
  /* private */ def _evtMouseDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the split panel.
    */
  /* private */ def _evtMouseMove(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the split panel.
    */
  /* private */ def _evtMouseUp(event: js.Any): js.Any = js.native
  /**
    * Release the mouse grab for the split panel.
    */
  /* private */ def _releaseMouse(): js.Any = js.native
  /**
    * Handle the DOM events for the split panel.
    *
    * @param event - The DOM event sent to the panel.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Get the relative sizes of the widgets in the panel.
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
    * Set the relative sizes for the widgets in the panel.
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

