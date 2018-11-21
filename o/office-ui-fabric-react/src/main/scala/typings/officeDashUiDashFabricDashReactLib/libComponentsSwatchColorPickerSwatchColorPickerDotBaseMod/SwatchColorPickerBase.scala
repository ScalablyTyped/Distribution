package typings
package officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.base", "SwatchColorPickerBase")
@js.native
class SwatchColorPickerBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps, 
      ISwatchColorPickerState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPicker {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps) = this()
  var _cellFocused: js.Any = js.native
  var _id: js.Any = js.native
  /**
       * Handle the click on a cell
       * @param item - The cell that the click was fired against
       */
  var _onCellClick: js.Any = js.native
  /**
       * Callback passed to the GridCell class that will trigger the onCellFocus callback of the SwatchColorPicker
       */
  var _onGridCellFocused: js.Any = js.native
  /**
       * Callback passed to the GridCell class that will trigger the onCellHovered callback of the SwatchColorPicker
       * NOTE: This will not be triggered if shouldFocusOnHover === true
       */
  var _onGridCellHovered: js.Any = js.native
  /**
       * Callback that
       */
  var _onKeyDown: js.Any = js.native
  /**
       * Callback passed to the GridCell that will manage triggering the onCellHovered callback for mouseEnter
       */
  var _onMouseEnter: js.Any = js.native
  /**
       * Callback passed to the GridCell that will manage Hover/Focus updates
       */
  var _onMouseLeave: js.Any = js.native
  /**
       * Callback passed to the GridCell that will manage Hover/Focus updates
       */
  var _onMouseMove: js.Any = js.native
  /**
       * When the whole swatchColorPicker is blurred,
       * make sure to clear the pending focused stated
       */
  var _onSwatchColorPickerBlur: js.Any = js.native
  /**
       * Callback to make sure we don't update the hovered element during mouse wheel
       */
  var _onWheel: js.Any = js.native
  /**
       * Render a color cell
       * @param item - The item to render
       * @returns {JSX.Element} - Element representing the item
       */
  var _renderOption: js.Any = js.native
  var async: js.Any = js.native
  var isNavigationIdle: js.Any = js.native
  val navigationIdleDelay: js.Any = js.native
  var navigationIdleTimeoutId: js.Any = js.native
  /**
       * Sets a timeout so we won't process any mouse "hover" events
       * while navigating (via mouseWheel or arrowKeys)
       */
  var setNavigationTimeout: js.Any = js.native
  /**
       * Get the selected item's index
       * @param items - The items to search
       * @param selectedId - The selected item's id to find
       * @returns {number} - The index of the selected item's id, -1 if there was no match
       */
  /* private */ def _getSelectedIndex(items: js.Any, selectedId: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSwatchColorPickerBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSwatchColorPickerBase(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.base", "SwatchColorPickerBase")
@js.native
object SwatchColorPickerBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps = js.native
}

