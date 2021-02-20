package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateField extends StObject {
  
  var dateField: js.UndefOr[String] = js.native
  
  var dateOnly: js.UndefOr[Boolean] = js.native
  
  var formatUsing: js.UndefOr[String] = js.native
  
  var relativeTime: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object DateField {
  
  @scala.inline
  def apply(): DateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateField]
  }
  
  @scala.inline
  implicit class DateFieldMutableBuilder[Self <: DateField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    @scala.inline
    def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOnlyUndefined: Self = StObject.set(x, "dateOnly", js.undefined)
    
    @scala.inline
    def setFormatUsing(value: String): Self = StObject.set(x, "formatUsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUsingUndefined: Self = StObject.set(x, "formatUsing", js.undefined)
    
    @scala.inline
    def setRelativeTime(value: String): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
