package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dialog", JSImport.Namespace)
@js.native
object dialogMod extends js.Object {
  @js.native
  class DialogBase protected ()
    extends typings.officeUiFabricReact.dialogBaseMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typings.officeUiFabricReact.dialogContentBaseMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  
  @js.native
  class DialogFooterBase ()
    extends typings.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase
  
  val Dialog: StatelessComponent[IDialogProps] = js.native
  val DialogContent: StatelessComponent[IDialogContentProps] = js.native
  val DialogFooter: StatelessComponent[IDialogFooterProps] = js.native
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
    /* 2 */ val close: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    /* 1 */ val largeHeader: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    /* 0 */ val normal: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double] = js.native
  }
  
}

