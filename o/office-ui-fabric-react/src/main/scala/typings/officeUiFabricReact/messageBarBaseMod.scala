package typings.officeUiFabricReact

import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBarBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase")
  @js.native
  class MessageBarBase protected ()
    extends Component[IMessageBarProps, IMessageBarState, js.Any] {
    def this(props: IMessageBarProps) = this()
    
    var ICON_MAP: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _getActionsDiv: js.Any = js.native
    
    var _getAnnouncementPriority: js.Any = js.native
    
    var _getClassNames: js.Any = js.native
    
    var _getDismissDiv: js.Any = js.native
    
    var _getDismissSingleLine: js.Any = js.native
    
    var _getExpandSingleLine: js.Any = js.native
    
    var _getIconSpan: js.Any = js.native
    
    var _getRegionProps: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _renderInnerText: js.Any = js.native
    
    var _renderMultiLine: js.Any = js.native
    
    var _renderSingleLine: js.Any = js.native
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    @scala.inline
    def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMessageBarState extends StObject {
    
    var expandSingleLine: js.UndefOr[Boolean] = js.undefined
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var showContent: js.UndefOr[Boolean] = js.undefined
  }
  object IMessageBarState {
    
    @scala.inline
    def apply(): IMessageBarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarState]
    }
    
    @scala.inline
    implicit class IMessageBarStateMutableBuilder[Self <: IMessageBarState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandSingleLine(value: Boolean): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      @scala.inline
      def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      @scala.inline
      def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    }
  }
}
