package typings.numeral

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://numeraljs.com/#use-it
@js.native
trait Numeral extends StObject {
  
  def apply(): Numeral = js.native
  def apply(value: js.Any): Numeral = js.native
  
  def add(value: js.Any): Numeral = js.native
  
  def defaultFormat(format: String): Unit = js.native
  
  def difference(value: js.Any): Double = js.native
  
  def divide(value: js.Any): Numeral = js.native
  
  def format(): String = js.native
  def format(inputString: String): String = js.native
  def format(inputString: String, roundingFunction: RoundingFunction): String = js.native
  def format(inputString: Unit, roundingFunction: RoundingFunction): String = js.native
  
  var isNumeral: Boolean = js.native
  
  /**
    * This function sets the current locale.  If no arguments are passed in,
    * it will simply return the current global locale key.
    */
  def locale(): String = js.native
  def locale(key: String): String = js.native
  
  /**
    * This function provides access to the loaded locale data.  If
    * no arguments are passed in, it will simply return the current
    * global locale object.
    *
    * @param key Locale key, e.g 'es' for a spanish locale definition
    */
  def localeData(): NumeralJSLocale = js.native
  def localeData(key: String): NumeralJSLocale = js.native
  
  /**
    * Object with all loaded locales
    */
  var locales: NumeralJSLocales = js.native
  
  def multiply(value: js.Any): Numeral = js.native
  
  def nullFormat(format: String): Unit = js.native
  
  var options: NumeralJSOptions = js.native
  
  /**
    * Registers a language definition or a custom format definition.
    *
    * @param what Allowed values are: either 'format' or 'locale'
    * @param key The key of the registerd type, e.g. 'de' for a german locale definition
    * @param value The locale definition or the format definitiion
    */
  def register(what: RegisterType, key: String, value: NumeralJSLocale): NumeralJSLocale | NumeralJsFormat = js.native
  def register(what: RegisterType, key: String, value: NumeralJsFormat): NumeralJSLocale | NumeralJsFormat = js.native
  
  /**
    * This function resets the configuration to all the defaults
    */
  def reset(): Unit = js.native
  
  def set(value: js.Any): Numeral = js.native
  
  def subtract(value: js.Any): Numeral = js.native
  
  def unformat(inputString: String): Double = js.native
  
  def validate(value: js.Any, culture: js.Any): Boolean = js.native
  
  def value(): Double = js.native
  
  var version: String = js.native
  
  def zeroFormat(format: String): Unit = js.native
}
