package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCard
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
import typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverCardBaseMod {
  
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
  object HoverCardBase {
    
    @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase.defaultProps")
    @js.native
    def defaultProps: CardDismissDelay = js.native
    @scala.inline
    def defaultProps_=(x: CardDismissDelay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IHoverCardState extends StObject {
    
    var isHoverCardVisible: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[ExpandingCardMode] = js.native
    
    var openMode: js.UndefOr[OpenCardMode] = js.native
  }
  object IHoverCardState {
    
    @scala.inline
    def apply(): IHoverCardState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHoverCardState]
    }
    
    @scala.inline
    implicit class IHoverCardStateMutableBuilder[Self <: IHoverCardState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHoverCardVisible(value: Boolean): Self = StObject.set(x, "isHoverCardVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHoverCardVisibleUndefined: Self = StObject.set(x, "isHoverCardVisible", js.undefined)
      
      @scala.inline
      def setMode(value: ExpandingCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpenMode(value: OpenCardMode): Self = StObject.set(x, "openMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenModeUndefined: Self = StObject.set(x, "openMode", js.undefined)
    }
  }
}
