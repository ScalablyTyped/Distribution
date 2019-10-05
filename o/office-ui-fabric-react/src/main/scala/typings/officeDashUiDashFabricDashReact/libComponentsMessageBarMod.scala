package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.IMessageBarProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/MessageBar", JSImport.Namespace)
@js.native
object libComponentsMessageBarMod extends js.Object {
  @js.native
  class MessageBarBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotBaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  
  val MessageBar: StatelessComponent[IMessageBarProps] = js.native
  /* static members */
  @js.native
  object MessageBarBase extends js.Object {
    var defaultProps: IMessageBarProps = js.native
  }
  
  @js.native
  object MessageBarType extends js.Object {
    /* 2 */ val blocked: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.blocked with Double = js.native
    /* 1 */ val error: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.error with Double = js.native
    /* 0 */ val info: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.info with Double = js.native
    /* 90000 */ val remove: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.remove with Double = js.native
    /* 3 */ val severeWarning: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.severeWarning with Double = js.native
    /* 4 */ val success: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.success with Double = js.native
    /* 5 */ val warning: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType with Double
      ] = js.native
  }
  
}

