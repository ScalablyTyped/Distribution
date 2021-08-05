package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "Dialog")
  @js.native
  val Dialog: FunctionComponent[IDialogProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogBase")
  @js.native
  class DialogBase protected ()
    extends typings.officeUiFabricReact.dialogBaseMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  /* static members */
  object DialogBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogBase.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    inline def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogContent")
  @js.native
  val DialogContent: FunctionComponent[IDialogContentProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogContentBase")
  @js.native
  class DialogContentBase protected ()
    extends typings.officeUiFabricReact.dialogContentBaseMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  /* static members */
  object DialogContentBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogContentBase.defaultProps")
    @js.native
    def defaultProps: IDialogContentProps = js.native
    inline def defaultProps_=(x: IDialogContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogFooter")
  @js.native
  val DialogFooter: FunctionComponent[IDialogFooterProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogFooterBase")
  @js.native
  class DialogFooterBase protected ()
    extends typings.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "DialogType")
  @js.native
  object DialogType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dialogContentTypesMod.DialogType & Double] = js.native
    
    /* 2 */ val close: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.close & Double = js.native
    
    /* 1 */ val largeHeader: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode & Double] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
}
