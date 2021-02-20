package typings.officeUiFabricReact

import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessageBarMod {
  
  @JSImport("office-ui-fabric-react/lib/MessageBar", "MessageBar")
  @js.native
  val MessageBar: FunctionComponent[IMessageBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/MessageBar", "MessageBarBase")
  @js.native
  class MessageBarBase protected ()
    extends typings.officeUiFabricReact.messageBarMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/MessageBar", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/MessageBar", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    @scala.inline
    def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/MessageBar", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.messageBarTypesMod.MessageBarType with Double] = js.native
    
    /* 2 */ val blocked: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked with Double = js.native
    
    /* 1 */ val error: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.error with Double = js.native
    
    /* 0 */ val info: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.info with Double = js.native
    
    /* 3 */ val severeWarning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning with Double = js.native
    
    /* 4 */ val success: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.success with Double = js.native
    
    /* 5 */ val warning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning with Double = js.native
  }
}
