package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a culture definition that can be applied to objects that accept a culture-related setting.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384004(v=vs.100).aspx}
  */
@JSGlobal("Sys.CultureInfo")
@js.native
class CultureInfo protected ()
  extends StObject
     with typings.microsoftAjax.Sys.CultureInfo {
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
  
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing string values that can be applied to Date type extensions.
    * Use the dateTimeFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Date type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  /* CompleteClass */
  var dateTimeFormat: js.Array[String] = js.native
  
  /**
    * Gets the culture value (locale) that represents a language and region.
    * @return The culture value (locale) that represents a language and region.
    */
  /* CompleteClass */
  var name: String = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing strings values that can be applied to Number type extensions.
    * Use the numberFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Number type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  /* CompleteClass */
  var numberFormat: js.Array[String] = js.native
}
object CultureInfo {
  
  @JSGlobal("Sys.CultureInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the globalization values of the current culture as sent by the server. This member is static and can be invoked without creating an instance of the class.
    * The CurrentCulture field contains the following fields associated with the current culture: name, dateTimeFormat, and numberFormat.
    * @return A Sys.CultureInfo object.
    */
  /* static member */
  @JSGlobal("Sys.CultureInfo.CurrentCulture")
  @js.native
  def CurrentCulture: typings.microsoftAjax.Sys.CultureInfo = js.native
  @scala.inline
  def CurrentCulture_=(x: typings.microsoftAjax.Sys.CultureInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CurrentCulture")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the globalization values of the invariant culture as sent by the server. This member is static and can be invoked without creating an instance of the class.
    * The InvariantCulture field contains the following fields associated with the invariant (culture-independent) culture: name, dateTimeFormat, and numberFormat.
    * @return A CultureInfo object.
    */
  /* static member */
  @JSGlobal("Sys.CultureInfo.InvariantCulture")
  @js.native
  def InvariantCulture: typings.microsoftAjax.Sys.CultureInfo = js.native
  @scala.inline
  def InvariantCulture_=(x: typings.microsoftAjax.Sys.CultureInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvariantCulture")(x.asInstanceOf[js.Any])
}
