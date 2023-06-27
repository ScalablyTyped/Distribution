package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkSensitivityLabelChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitivityLabelChangedEventArgs extends StObject {
  
  /**
    * The type of event that was raised. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    * 
    * @remarks
    * [Api set: Mailbox 1.13]
    */
  var `type`: olkSensitivityLabelChanged
}
object SensitivityLabelChangedEventArgs {
  
  inline def apply(): SensitivityLabelChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("olkSensitivityLabelChanged")
    __obj.asInstanceOf[SensitivityLabelChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityLabelChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setType(value: olkSensitivityLabelChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
