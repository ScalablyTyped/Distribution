package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#use-it
@js.native
trait Numeral extends js.Object {
  var isNumeral: scala.Boolean = js.native
  var options: NumeralJSOptions = js.native
  var version: java.lang.String = js.native
  def apply(): Numeral = js.native
  def apply(value: js.Any): Numeral = js.native
  def add(value: js.Any): Numeral = js.native
  def defaultFormat(format: java.lang.String): scala.Unit = js.native
  def difference(value: js.Any): scala.Double = js.native
  def divide(value: js.Any): Numeral = js.native
  def format(): java.lang.String = js.native
  def format(inputString: java.lang.String): java.lang.String = js.native
  def format(inputString: java.lang.String, roundingFunction: RoundingFunction): java.lang.String = js.native
  /**
  	 * This function sets the current locale.  If no arguments are passed in,
  	 * it will simply return the current global locale key.
  	 */
  def locale(): java.lang.String = js.native
  /**
  	 * This function sets the current locale.  If no arguments are passed in,
  	 * it will simply return the current global locale key.
  	 */
  def locale(key: java.lang.String): java.lang.String = js.native
  /**
  	 * This function provides access to the loaded locale data.  If
  	 * no arguments are passed in, it will simply return the current
  	 * global locale object.
  	 *
  	 * @param key Locale key, e.g 'es' for a spanish locale definition
  	 */
  def localeData(): NumeralJSLocale = js.native
  /**
  	 * This function provides access to the loaded locale data.  If
  	 * no arguments are passed in, it will simply return the current
  	 * global locale object.
  	 *
  	 * @param key Locale key, e.g 'es' for a spanish locale definition
  	 */
  def localeData(key: java.lang.String): NumeralJSLocale = js.native
  def multiply(value: js.Any): Numeral = js.native
  def nullFormat(format: java.lang.String): scala.Unit = js.native
  /**
  	 * Registers a language definition or a custom format definition.
  	 *
  	 * @param what Allowed values are: either 'format' or 'locale'
  	 * @param key The key of the registerd type, e.g. 'de' for a german locale definition
  	 * @param value The locale definition or the format definitiion
  	 */
  def register(what: RegisterType, key: java.lang.String, value: NumeralJSLocale): NumeralJSLocale | NumeralJsFormat = js.native
  /**
  	 * Registers a language definition or a custom format definition.
  	 *
  	 * @param what Allowed values are: either 'format' or 'locale'
  	 * @param key The key of the registerd type, e.g. 'de' for a german locale definition
  	 * @param value The locale definition or the format definitiion
  	 */
  def register(what: RegisterType, key: java.lang.String, value: NumeralJsFormat): NumeralJSLocale | NumeralJsFormat = js.native
  def set(value: js.Any): Numeral = js.native
  def subtract(value: js.Any): Numeral = js.native
  def unformat(inputString: java.lang.String): scala.Double = js.native
  def validate(value: js.Any, culture: js.Any): scala.Boolean = js.native
  def value(): scala.Double = js.native
  def zeroFormat(format: java.lang.String): scala.Unit = js.native
}

