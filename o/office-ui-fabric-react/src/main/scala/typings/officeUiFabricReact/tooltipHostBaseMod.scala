package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Delay
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHost
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHostBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
  @js.native
  open class TooltipHostBase protected ()
    extends Component[ITooltipHostProps, ITooltipHostState, Any]
       with ITooltipHost {
    def this(props: ITooltipHostProps) = this()
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _clearDismissTimer: Any = js.native
    
    /* private */ var _clearOpenTimer: Any = js.native
    
    /* private */ var _defaultTooltipId: Any = js.native
    
    /* private */ var _dismissTimerId: Any = js.native
    
    /* private */ var _getDelayTime: Any = js.native
    
    /* private */ var _getTargetElement: Any = js.native
    
    /* private */ var _hideTooltip: Any = js.native
    
    /* private */ var _onTooltipKeyDown: Any = js.native
    
    /* private */ var _onTooltipMouseEnter: Any = js.native
    
    /* private */ var _onTooltipMouseLeave: Any = js.native
    
    /* private */ var _openTimerId: Any = js.native
    
    /* private */ var _toggleTooltip: Any = js.native
    
    /* private */ var _tooltipHost: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltipHostBase(): Unit = js.native
    
    /**
      * Dismisses the tooltip.
      */
    /* CompleteClass */
    override def dismiss(): Unit = js.native
    
    /**
      * Shows the tooltip.
      */
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  /* static members */
  object TooltipHostBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase._currentVisibleTooltip")
    @js.native
    def _currentVisibleTooltip: Any = js.native
    inline def _currentVisibleTooltip_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_currentVisibleTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase.defaultProps")
    @js.native
    def defaultProps: Delay = js.native
    inline def defaultProps_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ITooltipHostState extends StObject {
    
    /** @deprecated No longer used internally */
    var isAriaPlaceholderRendered: Boolean
    
    var isTooltipVisible: Boolean
  }
  object ITooltipHostState {
    
    inline def apply(isAriaPlaceholderRendered: Boolean, isTooltipVisible: Boolean): ITooltipHostState = {
      val __obj = js.Dynamic.literal(isAriaPlaceholderRendered = isAriaPlaceholderRendered.asInstanceOf[js.Any], isTooltipVisible = isTooltipVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipHostState]
    }
    
    extension [Self <: ITooltipHostState](x: Self) {
      
      inline def setIsAriaPlaceholderRendered(value: Boolean): Self = StObject.set(x, "isAriaPlaceholderRendered", value.asInstanceOf[js.Any])
      
      inline def setIsTooltipVisible(value: Boolean): Self = StObject.set(x, "isTooltipVisible", value.asInstanceOf[js.Any])
    }
  }
}
