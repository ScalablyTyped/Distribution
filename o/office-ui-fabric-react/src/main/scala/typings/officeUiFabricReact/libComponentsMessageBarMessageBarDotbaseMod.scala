package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.IMessageBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMessageBarMessageBarDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase")
  @js.native
  open class MessageBarBase protected () extends Component[IMessageBarProps, IMessageBarState, Any] {
    def this(props: IMessageBarProps) = this()
    
    /* private */ var ICON_MAP: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _getActionsDiv: Any = js.native
    
    /* private */ var _getAnnouncementPriority: Any = js.native
    
    /* private */ var _getClassNames: Any = js.native
    
    /* private */ var _getDismissDiv: Any = js.native
    
    /* private */ var _getDismissSingleLine: Any = js.native
    
    /* private */ var _getExpandSingleLine: Any = js.native
    
    /* private */ var _getIconSpan: Any = js.native
    
    /* private */ var _getRegionProps: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _renderInnerText: Any = js.native
    
    /* private */ var _renderMultiLine: Any = js.native
    
    /* private */ var _renderSingleLine: Any = js.native
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.base", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    inline def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMessageBarState extends StObject {
    
    var expandSingleLine: js.UndefOr[Boolean] = js.undefined
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var showContent: js.UndefOr[Boolean] = js.undefined
  }
  object IMessageBarState {
    
    inline def apply(): IMessageBarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarState]
    }
    
    extension [Self <: IMessageBarState](x: Self) {
      
      inline def setExpandSingleLine(value: Boolean): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      inline def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
      
      inline def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    }
  }
}
