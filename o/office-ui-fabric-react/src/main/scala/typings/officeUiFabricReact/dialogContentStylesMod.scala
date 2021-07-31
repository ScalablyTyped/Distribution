package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyleProps
import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDialogContentStyleProps): IDialogContentStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDialogContentStyles]
}
