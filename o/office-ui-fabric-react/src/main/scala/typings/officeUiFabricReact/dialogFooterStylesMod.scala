package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterStyleProps
import typings.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogFooterStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogFooter.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDialogFooterStyleProps): IDialogFooterStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDialogFooterStyles]
}
