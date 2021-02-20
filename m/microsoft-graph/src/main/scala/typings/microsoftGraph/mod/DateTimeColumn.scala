package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeColumn extends StObject {
  
  /**
    * How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details.
    * If unspecified, treated as default.
    */
  var displayAs: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
  var format: js.UndefOr[NullableOption[String]] = js.native
}
object DateTimeColumn {
  
  @scala.inline
  def apply(): DateTimeColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeColumn]
  }
  
  @scala.inline
  implicit class DateTimeColumnMutableBuilder[Self <: DateTimeColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    @scala.inline
    def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
    
    @scala.inline
    def setFormat(value: NullableOption[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
