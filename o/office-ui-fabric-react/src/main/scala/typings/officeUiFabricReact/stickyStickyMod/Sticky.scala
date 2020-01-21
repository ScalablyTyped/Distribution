package typings.officeUiFabricReact.stickyStickyMod

import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.stickyTypesMod.IStickyProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.Context
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
@js.native
class Sticky protected () extends BaseComponent[IStickyProps, IStickyState] {
  def this(props: IStickyProps) = this()
  var _activeElement: js.Any = js.native
  var _getBackground: js.Any = js.native
  var _getContentStyles: js.Any = js.native
  var _getContext: js.Any = js.native
  var _getNonStickyDistanceFromTop: js.Any = js.native
  var _getNonStickyPlaceholderHeightAndWidth: js.Any = js.native
  var _getStickyDistanceFromTop: js.Any = js.native
  var _getStickyDistanceFromTopForFooter: js.Any = js.native
  var _getStickyPlaceholderHeight: js.Any = js.native
  var _nonStickyContent: js.Any = js.native
  var _onScrollEvent: js.Any = js.native
  var _placeHolder: js.Any = js.native
  var _root: js.Any = js.native
  var _stickyContentBottom: js.Any = js.native
  var _stickyContentTop: js.Any = js.native
  val canStickyBottom: Boolean = js.native
  val canStickyTop: Boolean = js.native
  val nonStickyContent: HTMLDivElement | Null = js.native
  val placeholder: HTMLDivElement | Null = js.native
  val root: HTMLDivElement | Null = js.native
  val stickyContentBottom: HTMLDivElement | Null = js.native
  val stickyContentTop: HTMLDivElement | Null = js.native
  def addSticky(stickyContent: HTMLDivElement): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSticky(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSticky(prevProps: IStickyProps, prevState: IStickyState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSticky(): Unit = js.native
  def resetSticky(): Unit = js.native
  def setDistanceFromTop(container: HTMLDivElement): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MSticky(nextProps: IStickyProps, nextState: IStickyState): Boolean = js.native
  def syncScroll(container: HTMLElement): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
@js.native
object Sticky extends js.Object {
  var contextType: Context[IScrollablePaneContext] = js.native
  var defaultProps: IStickyProps = js.native
}

