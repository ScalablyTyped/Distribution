package typings.officeUiFabricReact

import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerStyleProps
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePickerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IBasePickerStyleProps): IBasePickerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IBasePickerStyles]
}
