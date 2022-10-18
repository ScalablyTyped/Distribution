package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.IMessageBarProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMessageBarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBar")
  @js.native
  val MessageBar: FunctionComponent[IMessageBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
  @js.native
  open class MessageBarBase protected ()
    extends typings.officeUiFabricReact.libComponentsMessageBarMessageBarDotbaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    inline def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType & Double
      ] = js.native
    
    /* 2 */ val blocked: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.blocked & Double = js.native
    
    /* 1 */ val error: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.error & Double = js.native
    
    /* 0 */ val info: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.info & Double = js.native
    
    /* 3 */ val severeWarning: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.severeWarning & Double = js.native
    
    /* 4 */ val success: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.success & Double = js.native
    
    /* 5 */ val warning: typings.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.warning & Double = js.native
  }
}
