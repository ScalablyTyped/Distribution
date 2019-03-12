package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  //#region Extensions
  /**
    * Formats a number by using the invariant culture.
    * @returns true if the end of the String object matches suffix; otherwise, false.
    */
  def endsWith(suffix: java.lang.String): scala.Boolean
  /**
    * Removes leading and trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start and end of the string.
    */
  def trim(): java.lang.String
  /**
    * Removes trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the end of the string.
    */
  def trimEnd(): java.lang.String
  /**
    * Removes leading white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start of the string.
    */
  def trimStart(): java.lang.String
}

object String {
  @scala.inline
  def apply(
    endsWith: java.lang.String => scala.Boolean,
    trim: () => java.lang.String,
    trimEnd: () => java.lang.String,
    trimStart: () => java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction1(endsWith), trim = js.Any.fromFunction0(trim), trimEnd = js.Any.fromFunction0(trimEnd), trimStart = js.Any.fromFunction0(trimStart))
  
    __obj.asInstanceOf[String]
  }
}

