package typings
package atPhosphorWidgetsLib.libCommandpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/commandpalette", "CommandPalette")
@js.native
class CommandPalette protected ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  /**
    * Construct a new command palette.
    *
    * @param options - The options for initializing the palette.
    */
  def this(options: atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IOptions) = this()
  var _activeIndex: js.Any = js.native
  var _items: js.Any = js.native
  var _results: js.Any = js.native
  /**
    * The command registry used by the command palette.
    */
  val commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry = js.native
  /**
    * The command palette content node.
    *
    * #### Notes
    * This is the node which holds the command item nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: stdLib.HTMLUListElement = js.native
  /**
    * The command palette input node.
    *
    * #### Notes
    * This is the actual input node for the search area.
    */
  val inputNode: stdLib.HTMLInputElement = js.native
  /**
    * A read-only array of the command items in the palette.
    */
  val items: js.Array[atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IItem] = js.native
  /**
    * The renderer used by the command palette.
    */
  val renderer: atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IRenderer = js.native
  /**
    * The command palette search node.
    *
    * #### Notes
    * This is the node which contains the search-related elements.
    */
  val searchNode: stdLib.HTMLDivElement = js.native
  /**
    * Activate the next enabled command item.
    */
  /* private */ def _activateNextItem(): js.Any = js.native
  /**
    * Activate the previous enabled command item.
    */
  /* private */ def _activatePreviousItem(): js.Any = js.native
  /**
    * Handle the `'click'` event for the command palette.
    */
  /* private */ def _evtClick(event: js.Any): js.Any = js.native
  /**
    * Handle the `'keydown'` event for the command palette.
    */
  /* private */ def _evtKeyDown(event: js.Any): js.Any = js.native
  /**
    * Execute the command item at the given index, if possible.
    */
  /* private */ def _execute(index: js.Any): js.Any = js.native
  /**
    * A signal handler for generic command changes.
    */
  /* private */ def _onGenericChange(): js.Any = js.native
  /**
    * Toggle the focused modifier based on the input node focus state.
    */
  /* private */ def _toggleFocused(): js.Any = js.native
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns The command item added to the palette.
    */
  def addItem(options: atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IItemOptions): atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IItem = js.native
  /**
    * Remove all items from the command palette.
    */
  def clearItems(): scala.Unit = js.native
  /**
    * Handle the DOM events for the command palette.
    *
    * @param event - The DOM event sent to the command palette.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the command palette's DOM node.
    * It should not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Clear the search results and schedule an update.
    *
    * #### Notes
    * This should be called whenever the search results of the palette
    * should be updated.
    *
    * This is typically called automatically by the palette as needed,
    * but can be called manually if the input text is programatically
    * changed.
    *
    * The rendered results are updated asynchronously.
    */
  def refresh(): scala.Unit = js.native
  /**
    * Remove an item from the command palette.
    *
    * @param item - The item to remove from the palette.
    *
    * #### Notes
    * This is a no-op if the item is not in the palette.
    */
  def removeItem(item: atPhosphorWidgetsLib.libCommandpaletteMod.CommandPaletteNs.IItem): scala.Unit = js.native
  /**
    * Remove the item at a given index from the command palette.
    *
    * @param index - The index of the item to remove.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def removeItemAt(index: scala.Double): scala.Unit = js.native
}

