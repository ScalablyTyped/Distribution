package typings
package pluralsDashCldrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Locale extends js.Object {
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSName("ordinal")
  var ordinal_Original: pluralsDashCldrLib.pluralsDashCldrMod.Plural = js.native
  def ordinal(locale: java.lang.String, number: java.lang.String): Form | scala.Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  def ordinal(locale: java.lang.String, number: scala.Double): Form | scala.Null = js.native
}

