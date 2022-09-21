package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIPanelState
import typings.officeUiFabricReact.anon.ReadonlyIPanelProps
import typings.officeUiFabricReact.anon.ReadonlyIPanelState
import typings.officeUiFabricReact.panelTypesMod.IPanel
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
  @js.native
  open class PanelBase protected ()
    extends Component[IPanelProps, IPanelState, Any]
       with IPanel {
    def this(props: IPanelProps) = this()
    
    /* private */ var _allowScrollOnPanel: Any = js.native
    
    /* private */ var _allowTouchBodyScroll: Any = js.native
    
    /* private */ var _animateTo: Any = js.native
    
    /* private */ var _animationCallback: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _clearExistingAnimationTimer: Any = js.native
    
    /* private */ var _dismissOnOuterClick: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _hasCustomNavigation: Any = js.native
    
    /* private */ var _headerTextId: Any = js.native
    
    /* private */ var _onPanelClick: Any = js.native
    
    /* private */ var _onRenderBody: Any = js.native
    
    /* private */ var _onRenderFooter: Any = js.native
    
    /* private */ var _onRenderHeader: Any = js.native
    
    /* private */ var _onRenderNavigation: Any = js.native
    
    /* private */ var _onRenderNavigationContent: Any = js.native
    
    /* private */ var _onTransitionComplete: Any = js.native
    
    /* private */ var _panel: Any = js.native
    
    /* private */ var _scrollableContent: Any = js.native
    
    /* private */ var _shouldListenForOuterClick: Any = js.native
    
    /* private */ var _updateFooterPosition: Any = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPanelBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPanelBase(previousProps: IPanelProps, previousState: IPanelState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPanelBase(): Unit = js.native
    
    def dismiss(ev: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    /** isActive is true when panel is open or opening. */
    val isActive: Boolean = js.native
  }
  /* static members */
  object PanelBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase.defaultProps")
    @js.native
    def defaultProps: IPanelProps = js.native
    inline def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIPanelState | Null]
  }
  
  @js.native
  sealed trait PanelVisibilityState extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelVisibilityState")
  @js.native
  object PanelVisibilityState extends StObject {
    
    @js.native
    sealed trait animatingClosed
      extends StObject
         with PanelVisibilityState
    
    @js.native
    sealed trait animatingOpen
      extends StObject
         with PanelVisibilityState
    
    @js.native
    sealed trait closed
      extends StObject
         with PanelVisibilityState
    
    @js.native
    sealed trait open
      extends StObject
         with PanelVisibilityState
  }
  
  trait IPanelState extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var isFooterSticky: js.UndefOr[Boolean] = js.undefined
    
    var visibility: PanelVisibilityState
  }
  object IPanelState {
    
    inline def apply(visibility: PanelVisibilityState): IPanelState = {
      val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelState]
    }
    
    extension [Self <: IPanelState](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
      
      inline def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
      
      inline def setVisibility(value: PanelVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
}
