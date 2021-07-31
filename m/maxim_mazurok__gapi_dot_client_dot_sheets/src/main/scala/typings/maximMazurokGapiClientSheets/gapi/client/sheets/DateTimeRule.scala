package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeRule extends StObject {
  
  /** The type of date-time grouping to apply. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DateTimeRule {
  
  @scala.inline
  def apply(): DateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeRule]
  }
  
  @scala.inline
  implicit class DateTimeRuleMutableBuilder[Self <: DateTimeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
