package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatListFormatMod {
  
  @JSImport("sap/ui/core/format/ListFormat", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ListFormat {
    
    /**
      * Formats a list according to the given format options.
      *
      * @returns The formatted output value.
      */
    /* CompleteClass */
    override def format(/**
      * The value to format
      */
    aList: js.Array[Any]): String = js.native
    
    /**
      * Parses a given list string into an array.
      *
      * @returns The parsed output value
      */
    /* CompleteClass */
    override def parse(/**
      * String value to be parsed
      */
    sValue: String): js.Array[Any] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/format/ListFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an instance of the ListFormat which can be used for formatting.
      *
      * @returns Instance of the ListFormat
      */
    inline def getInstance(): ListFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ListFormat]
    inline def getInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: js.Object): ListFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[ListFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: js.Object,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): ListFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[ListFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): ListFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[ListFormat]
  }
  
  trait ListFormat extends StObject {
    
    /**
      * Formats a list according to the given format options.
      *
      * @returns The formatted output value.
      */
    def format(/**
      * The value to format
      */
    aList: js.Array[Any]): String
    
    /**
      * Parses a given list string into an array.
      *
      * @returns The parsed output value
      */
    def parse(/**
      * String value to be parsed
      */
    sValue: String): js.Array[Any]
  }
  object ListFormat {
    
    inline def apply(format: js.Array[Any] => String, parse: String => js.Array[Any]): ListFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[ListFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListFormat] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: js.Array[Any] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setParse(value: String => js.Array[Any]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
