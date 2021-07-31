package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogTypesMod.IDialogStyleProps
import typings.officeUiFabricReact.dialogTypesMod.IDialogStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDialogStyleProps): IDialogStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDialogStyles]
}
