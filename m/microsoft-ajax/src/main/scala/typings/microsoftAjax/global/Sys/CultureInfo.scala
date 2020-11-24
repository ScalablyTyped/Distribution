package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a culture definition that can be applied to objects that accept a culture-related setting.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384004(v=vs.100).aspx}
  */
@JSGlobal("Sys.CultureInfo")
@js.native
class CultureInfo protected ()
  extends typings.microsoftAjax.Sys.CultureInfo {
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.CultureInfo class.
    * @param name
    *           The culture value (locale) that represents a language and region.
    * @param numberFormat
    *           A culture-sensitive numeric formatting string.
    * @param dateTimeFormat
    *           A culture-sensitive date formatting string.
    */
  def this(name: String, numberFormat: String, dateTimeFormat: String) = this()
}
/* static members */
@JSGlobal("Sys.CultureInfo")
@js.native
object CultureInfo extends js.Object {
  
  /**
    * Gets the globalization values of the current culture as sent by the server. This member is static and can be invoked without creating an instance of the class.
    * The CurrentCulture field contains the following fields associated with the current culture: name, dateTimeFormat, and numberFormat.
    * @return A Sys.CultureInfo object.
    */
  var CurrentCulture: typings.microsoftAjax.Sys.CultureInfo = js.native
  
  /**
    * Gets the globalization values of the invariant culture as sent by the server. This member is static and can be invoked without creating an instance of the class.
    * The InvariantCulture field contains the following fields associated with the invariant (culture-independent) culture: name, dateTimeFormat, and numberFormat.
    * @return A CultureInfo object.
    */
  var InvariantCulture: typings.microsoftAjax.Sys.CultureInfo = js.native
}
