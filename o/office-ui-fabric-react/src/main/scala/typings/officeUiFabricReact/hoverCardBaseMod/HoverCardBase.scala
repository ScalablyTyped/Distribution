package typings.officeUiFabricReact.hoverCardBaseMod

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCard
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
@js.native
class HoverCardBase protected ()
  extends Component[IHoverCardProps, IHoverCardState, js.Any]
     with IHoverCard {
  def this(props: IHoverCardProps) = this()
  
  var _async: js.Any = js.native
  
  /**
    * Hide HoverCard
    * How we dismiss the card depends on where the callback is coming from.
    * This is provided by the `isNativeEvent` argument.
    *  true: Event is coming from event listeners set up in componentDidMount.
    *  false: Event is coming from the `onLeave` prop from the HoverCard component.
    */
  var _cardDismiss: js.Any = js.native
  
  var _cardOpen: js.Any = js.native
  
  var _childDismissEvent: js.Any = js.native
  
  var _classNames: js.Any = js.native
  
  var _currentMouseTarget: js.Any = js.native
  
  var _dismissTimerId: js.Any = js.native
  
  var _events: js.Any = js.native
  
  var _executeCardOpen: js.Any = js.native
  
  var _getTargetElement: js.Any = js.native
  
  var _hoverCard: js.Any = js.native
  
  var _instantOpenAsExpanded: js.Any = js.native
  
  var _nativeDismissEvent: js.Any = js.native
  
  var _openTimerId: js.Any = js.native
  
  var _setDismissedState: js.Any = js.native
  
  var _setEventListeners: js.Any = js.native
  
  var _shouldBlockHoverCard: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MHoverCardBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHoverCardBase(prevProps: IHoverCardProps, prevState: IHoverCardState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHoverCardBase(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
@js.native
object HoverCardBase extends js.Object {
  
  var defaultProps: CardDismissDelay = js.native
}
