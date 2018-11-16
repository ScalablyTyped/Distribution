package typings
package officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
class SearchBoxBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps, 
      ISearchBoxState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps) = this()
  var _inputElement: js.Any = js.native
  var _latestValue: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onClearClick: js.Any = js.native
  var _onClickFocus: js.Any = js.native
  var _onFocusCapture: js.Any = js.native
  var _onInputChange: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _rootElement: js.Any = js.native
  /* private */ def _callOnChange(newValue: js.Any): js.Any = js.native
  /* private */ def _onClear(ev: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBoxBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps
  ): scala.Unit = js.native
  /**
       * Sets focus to the search box input field
       */
  def focus(): scala.Unit = js.native
  /**
       * Returns whether or not the SearchBox has focus
       */
  def hasFocus(): scala.Boolean = js.native
}

@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
object SearchBoxBase extends js.Object {
  var defaultProps: stdLib.Pick[
    officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps, 
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.disableAnimation | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.clearButtonProps
  ] = js.native
}

