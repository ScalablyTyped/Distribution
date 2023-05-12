package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapMLibraryMod.DynamicDateRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateUtilMod extends Shortcut {
  
  @JSImport("sap/m/DynamicDateUtil", JSImport.Default)
  @js.native
  val default: DynamicDateUtil = js.native
  
  /**
    * @EXPERIMENTAL (since 1.92) - This class is experimental and provides only limited functionality. Also
    * the API might be changed in future.
    *
    * The DynamicDateUtil is a utility class for working with the DynamicDateOption instances.
    */
  trait DynamicDateUtil extends StObject {
    
    /**
      * Adds an option to be reused as a global object.
      */
    def addOption(/**
      * The option to be added
      */
    option: typings.openui5.sapMDynamicDateOptionMod.default): Unit
    
    /**
      * Gets all available standard and custom dynamic date option keys.
      *
      * @returns An array of all option keys
      */
    def getAllOptionKeys(): js.Array[String]
    
    /**
      * Gets an option by its key.
      *
      * @returns The option
      */
    def getOption(/**
      * The option key
      */
    sKey: String): typings.openui5.sapMDynamicDateOptionMod.default
    
    /**
      * Gets sorted array of all standard keys.
      *
      * @returns An array of standard option keys
      */
    def getStandardKeys(): js.Array[String]
    
    /**
      * Parses a string to an array of objects of type `sap.m.DynamicDateRangeValue`. Uses the provided formatter.
      *
      * @returns An array of `sap.m.DynamicDateRangeValue` objects
      */
    def parse(
      /**
      * The string to be parsed
      */
    sValue: String,
      /**
      * A dynamic date formatter
      */
    oFormatter: typings.openui5.sapMDynamicDateFormatMod.default,
      /**
      * array of option names
      */
    aOptionKeys: js.Array[String]
    ): js.Array[DynamicDateRangeValue]
    
    /**
      * Returns a date in machine timezone setting, removing the offset added by the application configuration.
      *
      * @returns A local JS date with removed offset
      */
    def removeTimezoneOffset(/**
      * A local JS date with added offset
      */
    oDate: js.Date): js.Date
    
    /**
      * Calculates a date range from a provided object in the format of the DynamicDateRange's value.
      *
      * @returns An array of two date objects - start and end date
      */
    def toDates(
      /**
      * The provided value
      */
    oValue: String,
      /**
      * The type of calendar week numbering
      */
    sCalendarWeekNumbering: String
    ): js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]
  }
  object DynamicDateUtil {
    
    inline def apply(
      addOption: typings.openui5.sapMDynamicDateOptionMod.default => Unit,
      getAllOptionKeys: () => js.Array[String],
      getOption: String => typings.openui5.sapMDynamicDateOptionMod.default,
      getStandardKeys: () => js.Array[String],
      parse: (String, typings.openui5.sapMDynamicDateFormatMod.default, js.Array[String]) => js.Array[DynamicDateRangeValue],
      removeTimezoneOffset: js.Date => js.Date,
      toDates: (String, String) => js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]
    ): DynamicDateUtil = {
      val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), getAllOptionKeys = js.Any.fromFunction0(getAllOptionKeys), getOption = js.Any.fromFunction1(getOption), getStandardKeys = js.Any.fromFunction0(getStandardKeys), parse = js.Any.fromFunction3(parse), removeTimezoneOffset = js.Any.fromFunction1(removeTimezoneOffset), toDates = js.Any.fromFunction2(toDates))
      __obj.asInstanceOf[DynamicDateUtil]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicDateUtil] (val x: Self) extends AnyVal {
      
      inline def setAddOption(value: typings.openui5.sapMDynamicDateOptionMod.default => Unit): Self = StObject.set(x, "addOption", js.Any.fromFunction1(value))
      
      inline def setGetAllOptionKeys(value: () => js.Array[String]): Self = StObject.set(x, "getAllOptionKeys", js.Any.fromFunction0(value))
      
      inline def setGetOption(value: String => typings.openui5.sapMDynamicDateOptionMod.default): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setGetStandardKeys(value: () => js.Array[String]): Self = StObject.set(x, "getStandardKeys", js.Any.fromFunction0(value))
      
      inline def setParse(
        value: (String, typings.openui5.sapMDynamicDateFormatMod.default, js.Array[String]) => js.Array[DynamicDateRangeValue]
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setRemoveTimezoneOffset(value: js.Date => js.Date): Self = StObject.set(x, "removeTimezoneOffset", js.Any.fromFunction1(value))
      
      inline def setToDates(value: (String, String) => js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]): Self = StObject.set(x, "toDates", js.Any.fromFunction2(value))
    }
  }
  
  type _To = DynamicDateUtil
  
  /* This means you don't have to write `default`, but can instead just say `sapMDynamicDateUtilMod.foo` */
  override def _to: DynamicDateUtil = default
}
