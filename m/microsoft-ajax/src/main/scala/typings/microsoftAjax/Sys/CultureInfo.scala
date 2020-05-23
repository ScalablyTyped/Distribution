package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a culture definition that can be applied to objects that accept a culture-related setting.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384004(v=vs.100).aspx}
  */
trait CultureInfo extends js.Object {
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing string values that can be applied to Date type extensions.
    * Use the dateTimeFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Date type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var dateTimeFormat: js.Array[String]
  /**
    * Gets the culture value (locale) that represents a language and region.
    * @return The culture value (locale) that represents a language and region.
    */
  var name: String
  //#endregion
  //#region Properties
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing strings values that can be applied to Number type extensions.
    * Use the numberFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Number type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var numberFormat: js.Array[String]
}

object CultureInfo {
  @scala.inline
  def apply(dateTimeFormat: js.Array[String], name: String, numberFormat: js.Array[String]): CultureInfo = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfo]
  }
}

