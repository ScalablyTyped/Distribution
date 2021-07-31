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
  class PanelBase protected ()
    extends Component[IPanelProps, IPanelState, js.Any]
       with IPanel {
    def this(props: IPanelProps) = this()
    
    var _allowScrollOnPanel: js.Any = js.native
    
    var _allowTouchBodyScroll: js.Any = js.native
    
    var _animateTo: js.Any = js.native
    
    var _animationCallback: js.Any = js.native
    
    var _async: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _clearExistingAnimationTimer: js.Any = js.native
    
    var _dismissOnOuterClick: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _hasCustomNavigation: js.Any = js.native
    
    var _headerTextId: js.Any = js.native
    
    var _onPanelClick: js.Any = js.native
    
    var _onRenderBody: js.Any = js.native
    
    var _onRenderFooter: js.Any = js.native
    
    var _onRenderHeader: js.Any = js.native
    
    var _onRenderNavigation: js.Any = js.native
    
    var _onRenderNavigationContent: js.Any = js.native
    
    var _onTransitionComplete: js.Any = js.native
    
    var _panel: js.Any = js.native
    
    var _scrollableContent: js.Any = js.native
    
    var _shouldListenForOuterClick: js.Any = js.native
    
    var _updateFooterPosition: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIPanelState | Null]
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
    
    @scala.inline
    def apply(visibility: PanelVisibilityState): IPanelState = {
      val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelState]
    }
    
    @scala.inline
    implicit class IPanelStateMutableBuilder[Self <: IPanelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
      
      @scala.inline
      def setVisibility(value: PanelVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
}
