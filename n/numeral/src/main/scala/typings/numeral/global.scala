package typings.numeral

import typings.numeral.mod.NumeralJSFormat
import typings.numeral.mod.NumeralJSFormats
import typings.numeral.mod.NumeralJSLocale
import typings.numeral.mod.NumeralJSLocales
import typings.numeral.mod.NumeralJSOptions
import typings.numeral.mod.NumeralJSUtils
import typings.numeral.mod.RegisterType
import typings.numeral.mod.VERSION_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object numeral {
    
    /**
      * A javascript library for formatting and manipulating numbers.
      */
    inline def apply(): typings.numeral.mod.Numeral = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.numeral.mod.Numeral]
    inline def apply(input: Any): typings.numeral.mod.Numeral = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[typings.numeral.mod.Numeral]
    
    @JSGlobal("numeral")
    @js.native
    val ^ : js.Any = js.native
    
    // http://numeraljs.com/#use-it
    @JSGlobal("numeral.Numeral")
    @js.native
    open class Numeral protected ()
      extends typings.numeral.mod.Numeral {
      def this(input: Any, value: Double) = this()
    }
    
    /**
      * Object with utility functions
      */
    @JSGlobal("numeral._")
    @js.native
    val _underscore: NumeralJSUtils = js.native
    
    inline def defaultFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("numeral.fn")
    @js.native
    val fn: /* import warning: importer.ImportType#apply Failed type conversion: numeral.numeral.Numeral['prototype'] */ js.Any = js.native
    
    /**
      * Object with all loaded formats
      */
    @JSGlobal("numeral.formats")
    @js.native
    val formats: NumeralJSFormats = js.native
    
    /** compare numeral object */
    inline def isNumeral(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeral")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * This function sets the current locale.  If no arguments are passed in,
      * it will simply return the current global locale key.
      */
    inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
    inline def locale(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * This function provides access to the loaded locale data.  If
      * no arguments are passed in, it will simply return the current
      * global locale object.
      *
      * @param key Locale key, e.g 'es' for a spanish locale definition
      */
    inline def localeData(): NumeralJSLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[NumeralJSLocale]
    inline def localeData(key: String): NumeralJSLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[NumeralJSLocale]
    
    /**
      * Object with all loaded locales
      */
    @JSGlobal("numeral.locales")
    @js.native
    val locales: NumeralJSLocales = js.native
    
    inline def nullFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nullFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("numeral.options")
    @js.native
    val options: NumeralJSOptions = js.native
    
    inline def register(what: RegisterType, key: String, value: NumeralJSFormat): NumeralJSLocale | NumeralJSFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(what.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NumeralJSLocale | NumeralJSFormat]
    /**
      * Registers a language definition or a custom format definition.
      *
      * @param what Allowed values are: either 'format' or 'locale'
      * @param key The key of the registerd type, e.g. 'de' for a german locale definition
      * @param value The locale definition or the format definitiion
      */
    inline def register(what: RegisterType, key: String, value: NumeralJSLocale): NumeralJSLocale | NumeralJSFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(what.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NumeralJSLocale | NumeralJSFormat]
    
    /**
      * This function resets the configuration to all the defaults
      */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    inline def validate(value: Any, culture: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("numeral.version")
    @js.native
    val version: VERSION_ = js.native
    
    inline def zeroFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
