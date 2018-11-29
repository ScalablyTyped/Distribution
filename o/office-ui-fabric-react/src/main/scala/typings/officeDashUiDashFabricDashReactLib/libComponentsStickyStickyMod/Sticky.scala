package typings
package officeDashUiDashFabricDashReactLib.libComponentsStickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
@js.native
class Sticky protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.IStickyProps, 
      IStickyState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.IStickyProps) = this()
  var _getNonStickyDistanceFromTop: js.Any = js.native
  var _getStickyDistanceFromTop: js.Any = js.native
  var _getStickyDistanceFromTopForFooter: js.Any = js.native
  var _nonStickyContent: js.Any = js.native
  var _onScrollEvent: js.Any = js.native
  var _placeHolder: js.Any = js.native
  var _root: js.Any = js.native
  var _stickyContentBottom: js.Any = js.native
  var _stickyContentTop: js.Any = js.native
  val canStickyBottom: scala.Boolean = js.native
  val canStickyTop: scala.Boolean = js.native
  @JSName("context")
  var context_Sticky: officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotBaseMod.IScrollablePaneContext = js.native
  var distanceFromTop: scala.Double = js.native
  val nonStickyContent: reactLib.HTMLDivElement | scala.Null = js.native
  val placeholder: reactLib.HTMLDivElement | scala.Null = js.native
  val root: reactLib.HTMLDivElement | scala.Null = js.native
  val stickyContentBottom: reactLib.HTMLDivElement | scala.Null = js.native
  val stickyContentTop: reactLib.HTMLDivElement | scala.Null = js.native
  /* private */ def _getBackground(): js.Any = js.native
  /* private */ def _getContentStyles(isSticky: js.Any): js.Any = js.native
  /* private */ def _getNonStickyPlaceholderHeight(): js.Any = js.native
  /* private */ def _getStickyPlaceholderHeight(isSticky: js.Any): js.Any = js.native
  /* private */ def _setDistanceFromTop(distance: js.Any): js.Any = js.native
  def addSticky(stickyContent: reactLib.HTMLDivElement): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSticky(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSticky(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.IStickyProps,
    prevState: IStickyState
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSticky(): scala.Unit = js.native
  def resetSticky(): scala.Unit = js.native
  def setDistanceFromTop(container: reactLib.HTMLDivElement): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MSticky(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.IStickyProps,
    nextState: IStickyState
  ): scala.Boolean = js.native
  def syncScroll(container: reactLib.HTMLElement): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky", "Sticky")
@js.native
object Sticky extends js.Object {
  var contextTypes: officeDashUiDashFabricDashReactLib.libComponentsStickyStickyMod.IStickyContext = js.native
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.IStickyProps = js.native
}

