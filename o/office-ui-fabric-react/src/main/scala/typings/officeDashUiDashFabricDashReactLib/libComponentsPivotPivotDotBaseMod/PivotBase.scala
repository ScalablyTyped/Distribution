package typings
package officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.base", "PivotBase")
@js.native
class PivotBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.IPivotProps, 
      IPivotState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.IPivotProps) = this()
  var _classNames: js.Any = js.native
  var _keyToIndexMapping: js.Any = js.native
  var _keyToTabIds: js.Any = js.native
  var _pivotId: js.Any = js.native
  var _renderLinkContent: js.Any = js.native
  /**
    * Renders the current Pivot Item
    */
  var _renderPivotItem: js.Any = js.native
  var _renderPivotLink: js.Any = js.native
  var focusZone: js.Any = js.native
  /* private */ def _getClassNames(props: js.Any): js.Any = js.native
  /**
    * Gets the set of PivotLinks as arrary of IPivotItemProps
    * The set of Links is determined by child components of type PivotItem
    */
  /* private */ def _getPivotLinks(props: js.Any): js.Any = js.native
  /**
    * Generates the Id for the tab button.
    */
  /* private */ def _getTabId(itemKey: js.Any, index: js.Any): js.Any = js.native
  /**
    * whether the key exists in the pivot items.
    */
  /* private */ def _isKeyValid(itemKey: js.Any): js.Any = js.native
  /**
    * Handle the onKeyPress eventon the PivotLinks
    */
  /* private */ def _onKeyPress(itemKey: js.Any, ev: js.Any): js.Any = js.native
  /**
    * Handles the onClick event on PivotLinks
    */
  /* private */ def _onLinkClick(itemKey: js.Any, ev: js.Any): js.Any = js.native
  /**
    * Renders the set of links to route between pivots
    */
  /* private */ def _renderPivotLinks(): js.Any = js.native
  /**
    * Updates the state with the new selected index
    */
  /* private */ def _updateSelectedItem(itemKey: js.Any): js.Any = js.native
  /* private */ def _updateSelectedItem(itemKey: js.Any, ev: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPivotBase(nextProps: officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.IPivotProps): scala.Unit = js.native
  /**
    * Sets focus to the first pivot tab.
    */
  def focus(): scala.Unit = js.native
}

