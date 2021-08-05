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
  class TooltipHostBase protected ()
    extends Component[ITooltipHostProps, ITooltipHostState, js.Any]
       with ITooltipHost {
    def this(props: ITooltipHostProps) = this()
    
    /* private */ var _async: js.Any = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _clearDismissTimer: js.Any = js.native
    
    /* private */ var _clearOpenTimer: js.Any = js.native
    
    /* private */ var _defaultTooltipId: js.Any = js.native
    
    /* private */ var _dismissTimerId: js.Any = js.native
    
    /* private */ var _getDelayTime: js.Any = js.native
    
    /* private */ var _getTargetElement: js.Any = js.native
    
    /* private */ var _hideTooltip: js.Any = js.native
    
    /* private */ var _onTooltipKeyDown: js.Any = js.native
    
    /* private */ var _onTooltipMouseEnter: js.Any = js.native
    
    /* private */ var _onTooltipMouseLeave: js.Any = js.native
    
    /* private */ var _openTimerId: js.Any = js.native
    
    /* private */ var _toggleTooltip: js.Any = js.native
    
    /* private */ var _tooltipHost: js.Any = js.native
    
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
    def _currentVisibleTooltip: js.Any = js.native
    inline def _currentVisibleTooltip_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_currentVisibleTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase.defaultProps")
    @js.native
    def defaultProps: Delay = js.native
    inline def defaultProps_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ITooltipHostState extends StObject {
    
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
