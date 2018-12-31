package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) String object by including static and instance methods.
* String Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397472(v=vs.100).aspx}
*/
trait StringConstructor extends js.Object {
  /**
  * Replaces each format item in a String object with the text equivalent of a corresponding object's value.
  * @returns A copy of the string with the formatting applied.
  */
  def format(format: java.lang.String, args: js.Any*): java.lang.String
  /**
    * Replaces the format items in a String object with the text equivalent of a corresponding object's value. The current culture is used to format dates and numbers.
    * @returns A copy of the string with the formatting applied.
    */
  def localeFormat(format: java.lang.String, args: js.Any*): java.lang.String
}

