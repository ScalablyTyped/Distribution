package typings
package pluralsDashCldrLib.pluralsDashCldrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plural extends js.Object {
  def apply(locale: java.lang.String, number: java.lang.String): Form | scala.Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  def apply(locale: java.lang.String, number: scala.Double): Form | scala.Null = js.native
  /**
    * Returns an array of available forms for the given locale. If the
    * locale is not supported, returns `null`.
    *
    * @param locale The locale code.
    */
  def forms(locale: java.lang.String): js.Array[Form] | scala.Null = js.native
  def indexOf(locale: java.lang.String, number: java.lang.String): scala.Double = js.native
  /**
    * Returns the index of the form for a given number. If the locale is
    * not supported, returns `-1`.
    *
    * This is convenient for implementing a lookup from a compact, ordered
    * list. The order of forms for all locales is `zero`, `one`, `two`,
    * `few`, `many`, `other`. Remove the forms not used by a locale to get
    * the indices of each.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  def indexOf(locale: java.lang.String, number: scala.Double): scala.Double = js.native
}

