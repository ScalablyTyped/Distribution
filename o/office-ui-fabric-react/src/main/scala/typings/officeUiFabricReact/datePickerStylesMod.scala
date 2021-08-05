package typings.officeUiFabricReact

import typings.officeUiFabricReact.datePickerTypesMod.IDatePickerStyleProps
import typings.officeUiFabricReact.datePickerTypesMod.IDatePickerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styles(props: IDatePickerStyleProps): IDatePickerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")(props.asInstanceOf[js.Any]).asInstanceOf[IDatePickerStyles]
}
