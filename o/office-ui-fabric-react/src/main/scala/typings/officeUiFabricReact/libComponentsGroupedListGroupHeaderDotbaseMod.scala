package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsGroupedListGroupHeaderDottypesMod.IGroupHeaderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupHeaderDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
  @js.native
  open class GroupHeaderBase protected () extends Component[IGroupHeaderProps, IGroupHeaderState, Any] {
    def this(props: IGroupHeaderProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _defaultCheckboxRender: Any = js.native
    
    /* private */ var _fastDefaultCheckboxRender: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _onHeaderClick: Any = js.native
    
    /* private */ var _onKeyUp: Any = js.native
    
    /* private */ var _onRenderName: Any = js.native
    
    /* private */ var _onRenderTitle: Any = js.native
    
    /* private */ var _onToggleClick: Any = js.native
    
    /* private */ var _toggleCollapse: Any = js.native
  }
  /* static members */
  object GroupHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase.defaultProps")
    @js.native
    def defaultProps: IGroupHeaderProps = js.native
    inline def defaultProps_=(x: IGroupHeaderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IGroupHeaderProps, previousState: IGroupHeaderState): IGroupHeaderState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupHeaderState]
  }
  
  trait IGroupHeaderState extends StObject {
    
    var isCollapsed: Boolean
    
    var isLoadingVisible: Boolean
  }
  object IGroupHeaderState {
    
    inline def apply(isCollapsed: Boolean, isLoadingVisible: Boolean): IGroupHeaderState = {
      val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isLoadingVisible = isLoadingVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderState]
    }
    
    extension [Self <: IGroupHeaderState](x: Self) {
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingVisible(value: Boolean): Self = StObject.set(x, "isLoadingVisible", value.asInstanceOf[js.Any])
    }
  }
}
