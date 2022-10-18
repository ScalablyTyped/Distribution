package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.libComponentsHoverCardExpandingCardDottypesMod.ExpandingCardMode
import typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.IHoverCard
import typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.IHoverCardProps
import typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.OpenCardMode
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardHoverCardDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
  @js.native
  open class HoverCardBase protected ()
    extends Component[IHoverCardProps, IHoverCardState, Any]
       with IHoverCard {
    def this(props: IHoverCardProps) = this()
    
    /* private */ var _async: Any = js.native
    
    /**
      * Hide HoverCard
      * How we dismiss the card depends on where the callback is coming from.
      * This is provided by the `isNativeEvent` argument.
      *  true: Event is coming from event listeners set up in componentDidMount.
      *  false: Event is coming from the `onLeave` prop from the HoverCard component.
      */
    /* private */ var _cardDismiss: Any = js.native
    
    /* private */ var _cardOpen: Any = js.native
    
    /* private */ var _childDismissEvent: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _currentMouseTarget: Any = js.native
    
    /* private */ var _dismissTimerId: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _executeCardOpen: Any = js.native
    
    /* private */ var _getTargetElement: Any = js.native
    
    /* private */ var _hoverCard: Any = js.native
    
    /* private */ var _instantOpenAsExpanded: Any = js.native
    
    /* private */ var _nativeDismissEvent: Any = js.native
    
    /* private */ var _openTimerId: Any = js.native
    
    /* private */ var _setDismissedState: Any = js.native
    
    /* private */ var _setEventListeners: Any = js.native
    
    /* private */ var _shouldBlockHoverCard: Any = js.native
    
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
    inline def defaultProps_=(x: CardDismissDelay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IHoverCardState extends StObject {
    
    var isHoverCardVisible: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[ExpandingCardMode] = js.undefined
    
    var openMode: js.UndefOr[OpenCardMode] = js.undefined
  }
  object IHoverCardState {
    
    inline def apply(): IHoverCardState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHoverCardState]
    }
    
    extension [Self <: IHoverCardState](x: Self) {
      
      inline def setIsHoverCardVisible(value: Boolean): Self = StObject.set(x, "isHoverCardVisible", value.asInstanceOf[js.Any])
      
      inline def setIsHoverCardVisibleUndefined: Self = StObject.set(x, "isHoverCardVisible", js.undefined)
      
      inline def setMode(value: ExpandingCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpenMode(value: OpenCardMode): Self = StObject.set(x, "openMode", value.asInstanceOf[js.Any])
      
      inline def setOpenModeUndefined: Self = StObject.set(x, "openMode", js.undefined)
    }
  }
}
