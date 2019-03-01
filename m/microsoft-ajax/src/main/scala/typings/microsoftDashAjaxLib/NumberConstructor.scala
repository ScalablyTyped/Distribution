package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  /**
    * Returns a numeric value from a string representation of a number. This function is static and can be called without creating an instance of the object.
    */
  def parseInvariant(format: java.lang.String): scala.Double
  /**
    * Creates a numeric value from a locale-specific string.
    */
  def parseLocale(format: java.lang.String): scala.Double
}

object NumberConstructor {
  @scala.inline
  def apply(
    parseInvariant: js.Function1[java.lang.String, scala.Double],
    parseLocale: js.Function1[java.lang.String, scala.Double]
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseInvariant")(parseInvariant)
    __obj.updateDynamic("parseLocale")(parseLocale)
    __obj.asInstanceOf[NumberConstructor]
  }
}

