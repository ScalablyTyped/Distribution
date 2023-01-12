package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateFormatMod {
  
  @JSImport("sap/m/DynamicDateFormat", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DynamicDateFormat {
    
    /**
      * Formats a list according to the given format options.
      *
      * @returns The formatted output value.
      */
    /* CompleteClass */
    override def format(
      /**
      * The value to format
      */
    oObj: js.Object,
      /**
      * If set to `true` the formatter does not format to the equivalent user-friendly string. Instead, the formatter
      * uses the specified option key and parameters.
      */
    bSkipCustomFormatting: Boolean
    ): String = js.native
    
    /**
      * Parses a given list string into an array.
      *
      * @returns The parsed output value
      */
    /* CompleteClass */
    override def parse(
      /**
      * String value to be parsed
      */
    sValue: String,
      /**
      * String value of the key we will parse for
      */
    sKey: String
    ): js.Object = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DynamicDateFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an instance of the DynamicDateFormat which can be used for formatting.
      *
      * @returns Instance of the DynamicDateFormat
      */
    inline def getInstance(): DynamicDateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[DynamicDateFormat]
    inline def getInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: js.Object): DynamicDateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[DynamicDateFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: js.Object,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DynamicDateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DynamicDateFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DynamicDateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DynamicDateFormat]
  }
  
  trait DynamicDateFormat extends StObject {
    
    /**
      * Formats a list according to the given format options.
      *
      * @returns The formatted output value.
      */
    def format(
      /**
      * The value to format
      */
    oObj: js.Object,
      /**
      * If set to `true` the formatter does not format to the equivalent user-friendly string. Instead, the formatter
      * uses the specified option key and parameters.
      */
    bSkipCustomFormatting: Boolean
    ): String
    
    /**
      * Parses a given list string into an array.
      *
      * @returns The parsed output value
      */
    def parse(
      /**
      * String value to be parsed
      */
    sValue: String,
      /**
      * String value of the key we will parse for
      */
    sKey: String
    ): js.Object
  }
  object DynamicDateFormat {
    
    inline def apply(format: (js.Object, Boolean) => String, parse: (String, String) => js.Object): DynamicDateFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), parse = js.Any.fromFunction2(parse))
      __obj.asInstanceOf[DynamicDateFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicDateFormat] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: (js.Object, Boolean) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setParse(value: (String, String) => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    }
  }
}
