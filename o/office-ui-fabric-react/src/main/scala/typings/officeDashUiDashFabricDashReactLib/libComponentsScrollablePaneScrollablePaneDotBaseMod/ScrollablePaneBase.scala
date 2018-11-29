package typings
package officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.base", "ScrollablePaneBase")
@js.native
class ScrollablePaneBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps, 
      IScrollablePaneState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePane {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps) = this()
  var _addToStickyContainer: js.Any = js.native
  var _contentContainer: js.Any = js.native
  var _getStickyContainerStyle: js.Any = js.native
  var _mutationObserver: js.Any = js.native
  var _notifyThrottled: js.Any = js.native
  var _onScroll: js.Any = js.native
  var _onWindowResize: js.Any = js.native
  var _removeStickyFromContainers: js.Any = js.native
  var _root: js.Any = js.native
  var _stickies: js.Any = js.native
  var _stickyAboveRef: js.Any = js.native
  var _stickyBelowRef: js.Any = js.native
  var _subscribers: js.Any = js.native
  val contentContainer: reactLib.HTMLDivElement | scala.Null = js.native
  val root: reactLib.HTMLDivElement | scala.Null = js.native
  val stickyAbove: reactLib.HTMLDivElement | scala.Null = js.native
  val stickyBelow: reactLib.HTMLDivElement | scala.Null = js.native
  /* private */ def _checkStickyStatus(sticky: js.Any): js.Any = js.native
  /* private */ def _getScrollbarHeight(): js.Any = js.native
  /* private */ def _getScrollbarWidth(): js.Any = js.native
  def addSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MScrollablePaneBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollablePaneBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps,
    prevState: IScrollablePaneState
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollablePaneBase(): scala.Unit = js.native
  /** Triggers a layout update for the pane. */
  /* CompleteClass */
  override def forceLayoutUpdate(): scala.Unit = js.native
  def getChildContext(): IScrollablePaneContext = js.native
  /** Gets the current scroll position of the scrollable pane */
  /* CompleteClass */
  override def getScrollPosition(): scala.Double = js.native
  def notifySubscribers(): scala.Unit = js.native
  def removeSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def setStickiesDistanceFromTop(): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MScrollablePaneBase(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps,
    nextState: IScrollablePaneState
  ): scala.Boolean = js.native
  def sortSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def sortSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky, sortAgain: scala.Boolean): scala.Unit = js.native
  def subscribe(handler: js.Function): scala.Unit = js.native
  def syncScrollSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def unsubscribe(handler: js.Function): scala.Unit = js.native
  def updateStickyRefHeights(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.base", "ScrollablePaneBase")
@js.native
object ScrollablePaneBase extends js.Object {
  var childContextTypes: reactLib.reactMod.ReactNs.ValidationMap[
    officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotBaseMod.IScrollablePaneContext
  ] = js.native
}

