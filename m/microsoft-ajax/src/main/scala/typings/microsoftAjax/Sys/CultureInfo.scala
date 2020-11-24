package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a culture definition that can be applied to objects that accept a culture-related setting.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384004(v=vs.100).aspx}
  */
@js.native
trait CultureInfo extends js.Object {
  
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing string values that can be applied to Date type extensions.
    * Use the dateTimeFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Date type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var dateTimeFormat: js.Array[String] = js.native
  
  /**
    * Gets the culture value (locale) that represents a language and region.
    * @return The culture value (locale) that represents a language and region.
    */
  var name: String = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing strings values that can be applied to Number type extensions.
    * Use the numberFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Number type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var numberFormat: js.Array[String] = js.native
}
object CultureInfo {
  
  @scala.inline
  def apply(dateTimeFormat: js.Array[String], name: String, numberFormat: js.Array[String]): CultureInfo = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfo]
  }
  
  @scala.inline
  implicit class CultureInfoOps[Self <: CultureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateTimeFormatVarargs(value: String*): Self = this.set("dateTimeFormat", js.Array(value :_*))
    
    @scala.inline
    def setDateTimeFormat(value: js.Array[String]): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatVarargs(value: String*): Self = this.set("numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormat(value: js.Array[String]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
  }
}
