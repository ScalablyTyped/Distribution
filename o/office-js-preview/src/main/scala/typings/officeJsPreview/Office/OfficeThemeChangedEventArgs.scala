package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.officeThemeChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfficeThemeChangedEventArgs extends StObject {
  
  /**
    * Gets the updated Office theme.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * @beta
    */
  var officeTheme: OfficeTheme
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * @beta
    */
  var `type`: officeThemeChanged
}
object OfficeThemeChangedEventArgs {
  
  inline def apply(officeTheme: OfficeTheme): OfficeThemeChangedEventArgs = {
    val __obj = js.Dynamic.literal(officeTheme = officeTheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("officeThemeChanged")
    __obj.asInstanceOf[OfficeThemeChangedEventArgs]
  }
  
  extension [Self <: OfficeThemeChangedEventArgs](x: Self) {
    
    inline def setOfficeTheme(value: OfficeTheme): Self = StObject.set(x, "officeTheme", value.asInstanceOf[js.Any])
    
    inline def setType(value: officeThemeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
