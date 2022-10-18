package typings.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentProps
import typings.officeUiFabricReact.libComponentsDialogDialogDottypesMod.IDialogProps
import typings.officeUiFabricReact.libComponentsDialogDialogFooterDottypesMod.IDialogFooterProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Default)
  @js.native
  val default: FunctionComponent[IDialogProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "Dialog")
  @js.native
  val Dialog: FunctionComponent[IDialogProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase")
  @js.native
  open class DialogBase protected ()
    extends typings.officeUiFabricReact.libComponentsDialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  /* static members */
  object DialogBase {
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    inline def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContent")
  @js.native
  val DialogContent: FunctionComponent[IDialogContentProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase")
  @js.native
  open class DialogContentBase protected ()
    extends typings.officeUiFabricReact.libComponentsDialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  /* static members */
  object DialogContentBase {
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase.defaultProps")
    @js.native
    def defaultProps: IDialogContentProps = js.native
    inline def defaultProps_=(x: IDialogContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogFooter")
  @js.native
  val DialogFooter: FunctionComponent[IDialogFooterProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogFooterBase")
  @js.native
  open class DialogFooterBase protected ()
    extends typings.officeUiFabricReact.libComponentsDialogMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogType")
  @js.native
  object DialogType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType & Double
      ] = js.native
    
    /* 2 */ val close: typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType.close & Double = js.native
    
    /* 1 */ val largeHeader: typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType.largeHeader & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType.normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode & Double
      ] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
  
  type _To = FunctionComponent[IDialogProps]
  
  /* This means you don't have to write `default`, but can instead just say `libDialogMod.foo` */
  override def _to: FunctionComponent[IDialogProps] = default
}
