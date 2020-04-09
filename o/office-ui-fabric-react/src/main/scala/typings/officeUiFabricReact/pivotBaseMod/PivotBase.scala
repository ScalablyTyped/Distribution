package typings.officeUiFabricReact.pivotBaseMod

import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.base", "PivotBase")
@js.native
class PivotBase protected ()
  extends Component[IPivotProps, IPivotState, js.Any] {
  def this(props: IPivotProps) = this()
  var _classNames: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _getClassNames: js.Any = js.native
  /**
    * Gets the set of PivotLinks as array of IPivotItemProps
    * The set of Links is determined by child components of type PivotItem
    */
  var _getPivotLinks: js.Any = js.native
  var _getSelectedKey: js.Any = js.native
  /**
    * Generates the Id for the tab button.
    */
  var _getTabId: js.Any = js.native
  /**
    * whether the key exists in the pivot items.
    */
  var _isKeyValid: js.Any = js.native
  /**
    * Handle the onKeyPress event on the PivotLinks
    */
  var _onKeyPress: js.Any = js.native
  /**
    * Handles the onClick event on PivotLinks
    */
  var _onLinkClick: js.Any = js.native
  var _pivotId: js.Any = js.native
  var _renderLinkContent: js.Any = js.native
  /**
    * Renders the current Pivot Item
    */
  var _renderPivotItem: js.Any = js.native
  var _renderPivotLink: js.Any = js.native
  /**
    * Renders the set of links to route between pivots
    */
  var _renderPivotLinks: js.Any = js.native
  /**
    * Updates the state with the new selected index
    */
  var _updateSelectedItem: js.Any = js.native
  /**
    * Sets focus to the first pivot tab.
    */
  def focus(): Unit = js.native
}

