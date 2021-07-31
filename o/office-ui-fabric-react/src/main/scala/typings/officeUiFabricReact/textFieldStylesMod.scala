package typings.officeUiFabricReact

import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldStyleProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/TextField.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: ITextFieldStyleProps): ITextFieldStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITextFieldStyles]
}
