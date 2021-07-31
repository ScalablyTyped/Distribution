package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupHeaderBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
  @js.native
  class GroupHeaderBase protected ()
    extends Component[IGroupHeaderProps, IGroupHeaderState, js.Any] {
    def this(props: IGroupHeaderProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _defaultCheckboxRender: js.Any = js.native
    
    var _fastDefaultCheckboxRender: js.Any = js.native
    
    var _onHeaderClick: js.Any = js.native
    
    var _onKeyUp: js.Any = js.native
    
    var _onRenderTitle: js.Any = js.native
    
    var _onToggleClick: js.Any = js.native
    
    var _onToggleSelectGroupClick: js.Any = js.native
    
    var _toggleCollapse: js.Any = js.native
  }
  /* static members */
  object GroupHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase.defaultProps")
    @js.native
    def defaultProps: IGroupHeaderProps = js.native
    @scala.inline
    def defaultProps_=(x: IGroupHeaderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: IGroupHeaderProps, previousState: IGroupHeaderState): IGroupHeaderState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupHeaderState]
  }
  
  trait IGroupHeaderState extends StObject {
    
    var isCollapsed: Boolean
    
    var isLoadingVisible: Boolean
  }
  object IGroupHeaderState {
    
    @scala.inline
    def apply(isCollapsed: Boolean, isLoadingVisible: Boolean): IGroupHeaderState = {
      val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isLoadingVisible = isLoadingVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderState]
    }
    
    @scala.inline
    implicit class IGroupHeaderStateMutableBuilder[Self <: IGroupHeaderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingVisible(value: Boolean): Self = StObject.set(x, "isLoadingVisible", value.asInstanceOf[js.Any])
    }
  }
}
