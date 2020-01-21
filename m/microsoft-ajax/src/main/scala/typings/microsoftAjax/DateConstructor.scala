package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConstructor extends js.Object {
  /**
    * Creates a date from a string by using the invariant culture. This function is static and can be invoked without creating an instance of the object.
    * @return If value is a valid string representation of a date in the invariant format, an object of type Date; otherwise, null.
    * @param value
    *           A locale-specific string that represents a date.
    * @param formats
    *           (Optional) An array of custom formats.
    */
  def parseInvariant(value: java.lang.String): java.lang.String = js.native
  def parseInvariant(value: java.lang.String, formats: java.lang.String*): java.lang.String = js.native
  def parseInvariant(value: java.lang.String, formats: js.Array[java.lang.String]): java.lang.String = js.native
  /**
    * Creates a date from a locale-specific string by using the current culture. This function is static and can be invoked without creating an instance of the object.
    * @exception (Debug) formats contains an invalid format.
    * @param value
    *           A locale-specific string that represents a date.
    * @param formats
    *           (Optional) An array of custom formats.
    */
  def parseLocale(value: java.lang.String): Date = js.native
  def parseLocale(value: java.lang.String, formats: java.lang.String*): Date = js.native
  def parseLocale(value: java.lang.String, formats: js.Array[java.lang.String]): Date = js.native
}

