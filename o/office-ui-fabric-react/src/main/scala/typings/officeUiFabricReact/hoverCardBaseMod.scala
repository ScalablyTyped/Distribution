package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCard
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
import typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverCardBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
  @js.native
  class HoverCardBase protected ()
    extends Component[IHoverCardProps, IHoverCardState, js.Any]
       with IHoverCard {
    def this(props: IHoverCardProps) = this()
    
    /* private */ var _async: js.Any = js.native
    
    /**
      * Hide HoverCard
      * How we dismiss the card depends on where the callback is coming from.
      * This is provided by the `isNativeEvent` argument.
      *  true: Event is coming from event listeners set up in componentDidMount.
      *  false: Event is coming from the `onLeave` prop from the HoverCard component.
      */
    /* private */ var _cardDismiss: js.Any = js.native
    
    /* private */ var _cardOpen: js.Any = js.native
    
    /* private */ var _childDismissEvent: js.Any = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _currentMouseTarget: js.Any = js.native
    
    /* private */ var _dismissTimerId: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    /* private */ var _executeCardOpen: js.Any = js.native
    
    /* private */ var _getTargetElement: js.Any = js.native
    
    /* private */ var _hoverCard: js.Any = js.native
    
    /* private */ var _instantOpenAsExpanded: js.Any = js.native
    
    /* private */ var _nativeDismissEvent: js.Any = js.native
    
    /* private */ var _openTimerId: js.Any = js.native
    
    /* private */ var _setDismissedState: js.Any = js.native
    
    /* private */ var _setEventListeners: js.Any = js.native
    
    /* private */ var _shouldBlockHoverCard: js.Any = js.native
    
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
