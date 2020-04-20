package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  /**
    * Returns a numeric value from a string representation of a number. This function is static and can be called without creating an instance of the object.
    */
  def parseInvariant(format: java.lang.String): Double
  /**
    * Creates a numeric value from a locale-specific string.
    */
  def parseLocale(format: java.lang.String): Double
}

object NumberConstructor {
  @scala.inline
  def apply(parseInvariant: java.lang.String => Double, parseLocale: java.lang.String => Double): NumberConstructor = {
    val __obj = js.Dynamic.literal(parseInvariant = js.Any.fromFunction1(parseInvariant), parseLocale = js.Any.fromFunction1(parseLocale))
    __obj.asInstanceOf[NumberConstructor]
  }
}

