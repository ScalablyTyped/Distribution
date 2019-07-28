package typings.pluralsDashCldr

import typings.pluralsDashCldr.pluralsDashCldrMod.Form
import typings.pluralsDashCldr.pluralsDashCldrMod.Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ordinal extends js.Object {
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSName("ordinal")
  var ordinal_Original: Plural = js.native
  def ordinal(locale: String, number: String): Form | Null = js.native
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
  def ordinal(locale: String, number: Double): Form | Null = js.native
}

