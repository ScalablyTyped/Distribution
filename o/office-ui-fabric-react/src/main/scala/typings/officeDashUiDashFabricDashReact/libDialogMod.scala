package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialogProps
import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogFooterDotTypesMod.IDialogFooterProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Namespace)
@js.native
object libDialogMod extends js.Object {
  @js.native
  class DialogBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  
  @js.native
  class DialogFooterBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDialogMod.DialogFooterBase
  
  val Dialog: StatelessComponent[IDialogProps] = js.native
  val DialogContent: StatelessComponent[IDialogContentProps] = js.native
  val DialogFooter: StatelessComponent[IDialogFooterProps] = js.native
  val default: StatelessComponent[IDialogProps] = js.native
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    var defaultProps: IDialogProps = js.native
  }
  
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    var defaultProps: IDialogContentProps = js.native
  }
  
  @js.native
  object DialogType extends js.Object {
    /* 2 */ val close: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.close with Double = js.native
    /* 1 */ val largeHeader: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.largeHeader with Double = js.native
    /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType with Double
      ] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

