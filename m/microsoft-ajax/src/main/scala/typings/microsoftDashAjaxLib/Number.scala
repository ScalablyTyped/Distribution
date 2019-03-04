package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Extends the base ECMAScript (JavaScript) Number functionality with static and instance methods.
* Number Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310835(v=vs.100).aspx}
*/
trait Number extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def format(format: java.lang.String): java.lang.String
  /**
    * Formats a number by using the current culture.
    */
  def localeFormat(format: java.lang.String): java.lang.String
}

object Number {
  @scala.inline
  def apply(
    format: js.Function1[java.lang.String, java.lang.String],
    localeFormat: js.Function1[java.lang.String, java.lang.String]
  ): Number = {
    val __obj = js.Dynamic.literal(format = format, localeFormat = localeFormat)
  
    __obj.asInstanceOf[Number]
  }
}

