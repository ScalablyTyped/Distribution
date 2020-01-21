package typings.officeUiFabricReact.searchBoxBaseMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.clearButtonProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.disableAnimation
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.Component
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
class SearchBoxBase protected ()
  extends Component[ISearchBoxProps, ISearchBoxState, js.Any] {
  def this(props: ISearchBoxProps) = this()
  var _callOnChange: js.Any = js.native
  var _events: js.Any = js.native
  var _fallbackId: js.Any = js.native
  var _inputElement: js.Any = js.native
  var _latestValue: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onClear: js.Any = js.native
  var _onClearClick: js.Any = js.native
  var _onClickFocus: js.Any = js.native
  var _onFocusCapture: js.Any = js.native
  var _onInputChange: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _rootElement: js.Any = js.native
  @JSName("UNSAFE_componentWillMount")
  def UNSAFE_componentWillMount_MSearchBoxBase(): Unit = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSearchBoxBase(newProps: ISearchBoxProps): Unit = js.native
  /**
    * Sets focus to the search box input field
    */
  def focus(): Unit = js.native
  /**
    * Returns whether or not the SearchBox has focus
    */
  def hasFocus(): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
object SearchBoxBase extends js.Object {
  var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
}

