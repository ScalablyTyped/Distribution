package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestGherkinDataTableUtilsMod extends Shortcut {
  
  @JSImport("sap/ui/test/gherkin/dataTableUtils", JSImport.Default)
  @js.native
  val default: dataTableUtils = js.native
  
  /**
    * A simple object containing a series of normalization functions that change a string according to a particular
    * strategy. All strategies do the following normalization as a minimum:
    *
    *
    * 	 - Trim spaces off the string on both sides. For example: `" hello "` becomes `"hello"`.
    * 	 - Assume that dashes and underscores are analogs for a space. For example: `"sold-to party"` and `"sold
    *     to party"` are equivalent, and would both convert to the camelCase `"soldToParty"`.
    * 	 - Trim multiple spaces between words. For example: `"hello____world"` becomes `"hello world"`.
    * 	 - Remove any characters that are not alphanumeric or whitespace. For example: `"(hello)"` becomes `"hello"`.
    */
  trait normalization extends StObject {
    
    /**
      * For example: "First Name" -> "firstName"
      *
      * @returns the normalized input string with all words after the first capitalized and all spaces removed
      */
    def camelCase(/**
      * the string to normalize
      */
    sString: String): String
    
    /**
      * For example: "First Name" -> "first-name"
      *
      * @returns the normalized input string changed to lower case and with space between words replaced by a
      * hyphen ("-")
      */
    def hyphenated(/**
      * the string to normalize
      */
    sString: String): String
    
    /**
      * For example: "First Name" -> "First Name"
      *
      * @returns the original unchanged input string
      */
    def none(/**
      * the string to normalize
      */
    sString: String): String
    
    /**
      * For example: "first name" -> "FirstName"
      *
      * @returns the normalized input string with all words capitalized and all spaces removed
      */
    def pascalCase(/**
      * the string to normalize
      */
    sString: String): String
    
    /**
      * For example: "first name" -> "First Name"
      *
      * @returns the normalized input string with all words capitalized
      */
    def titleCase(/**
      * the string to normalize
      */
    sString: String): String
  }
  object normalization {
    
    @JSImport("sap/ui/test/gherkin/dataTableUtils", "normalization")
    @js.native
    val ^ : normalization = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: normalization] (val x: Self) extends AnyVal {
      
      inline def setCamelCase(value: String => String): Self = StObject.set(x, "camelCase", js.Any.fromFunction1(value))
      
      inline def setHyphenated(value: String => String): Self = StObject.set(x, "hyphenated", js.Any.fromFunction1(value))
      
      inline def setNone(value: String => String): Self = StObject.set(x, "none", js.Any.fromFunction1(value))
      
      inline def setPascalCase(value: String => String): Self = StObject.set(x, "pascalCase", js.Any.fromFunction1(value))
      
      inline def setTitleCase(value: String => String): Self = StObject.set(x, "titleCase", js.Any.fromFunction1(value))
    }
  }
  
  type _To = dataTableUtils
  
  /* This means you don't have to write `default`, but can instead just say `sapUiTestGherkinDataTableUtilsMod.foo` */
  override def _to: dataTableUtils = default
  
  /**
    * @since 1.40
    *
    * Provides utility functions for formatting 2D arrays of strings (such as the raw data loaded from a Gherkin
    * feature file) into a more useful format such as an array of objects or a single object. Also handles
    * normalization of the raw strings.
    */
  @js.native
  trait dataTableUtils extends StObject {
    
    /**
      * A simple object containing a series of normalization functions that change a string according to a particular
      * strategy. All strategies do the following normalization as a minimum:
      *
      *
      * 	 - Trim spaces off the string on both sides. For example: `" hello "` becomes `"hello"`.
      * 	 - Assume that dashes and underscores are analogs for a space. For example: `"sold-to party"` and `"sold
      *     to party"` are equivalent, and would both convert to the camelCase `"soldToParty"`.
      * 	 - Trim multiple spaces between words. For example: `"hello____world"` becomes `"hello world"`.
      * 	 - Remove any characters that are not alphanumeric or whitespace. For example: `"(hello)"` becomes `"hello"`.
      */
    var normalization: typings.openui5.sapUiTestGherkinDataTableUtilsMod.normalization = js.native
    
    /**
      * Takes the inputed 2D array "aData" and returns an equivalent object. Each row of data is expected to
      * be a property-value pair. To create nested objects, add extra columns to the data. E.g.
      * ```javascript
      *
      *  [
      *    ["Name", "Alice"],
      *    ["Mass", "135 lbs"],
      *    ["Telephone Number", "Home", "123-456-7890"],
      *    ["Telephone Number", "Work", "123-456-0987"]
      *  ]
      * ```
      *  For each data row, the right-most element becomes a property value, and everything else is a property
      * name. The property names get normalized according to the strategy defined by the parameter "vNorm". E.g.
      * using camelCase strategy
      * ```javascript
      *
      *   {
      *     name: "Alice",
      *     mass: "135 lbs",
      *     telephoneNumber: {
      *       home: "123-456-7890",
      *       work: "123-456-0987"
      *     }
      *   }
      * ```
      *
      *
      * @returns - an object equivalent to the input data, with property names normalized
      */
    def toObject(/**
      * the 2D array of strings to be converted
      */
    aData: js.Array[String]): js.Object = js.native
    def toObject(
      /**
      * the 2D array of strings to be converted
      */
    aData: js.Array[String],
      /**
      * the normalization function to use to normalize property names. Can also be a string with values "titleCase",
      * "pascalCase", "camelCase", "hyphenated" or "none".
      */
    vNorm: String
    ): js.Object = js.native
    def toObject(
      /**
      * the 2D array of strings to be converted
      */
    aData: js.Array[String],
      /**
      * the normalization function to use to normalize property names. Can also be a string with values "titleCase",
      * "pascalCase", "camelCase", "hyphenated" or "none".
      */
    vNorm: js.Function
    ): js.Object = js.native
    
    /**
      * Takes the inputed 2D array "aData" and returns an equivalent array of objects. The data is expected to
      * have a header row, with each subsequent row being an entity, and each column being a property of that
      * entity. E.g.
      * ```javascript
      *
      *   [
      *     ["Their Name",  "Their Age"],
      *     ["Alice",       "16"],
      *     ["Bob",         "22"]
      *   ]
      * ```
      *
      *
      * The data's column headers become the returned objects' property names. The property names get normalized
      * according to the strategy defined by the parameter "vNorm". E.g. using hyphenation strategy this is returned:
      *
      * ```javascript
      *
      *   [
      *     {their-name: "Alice", their-age: "16"},
      *     {their-name: "Bob", their-age: "22"}
      *   ]
      * ```
      *
      *
      * @returns - an array of objects equivalent to the input data, with property names normalized
      */
    def toTable(/**
      * the 2D array of strings to be converted, with a header row
      */
    aData: js.Array[String]): js.Array[js.Object] = js.native
    def toTable(
      /**
      * the 2D array of strings to be converted, with a header row
      */
    aData: js.Array[String],
      /**
      * the normalization function to use to normalize property names. Can also be a String with values "titleCase",
      * "pascalCase", "camelCase", "hyphenated" or "none".
      */
    vNorm: String
    ): js.Array[js.Object] = js.native
    def toTable(
      /**
      * the 2D array of strings to be converted, with a header row
      */
    aData: js.Array[String],
      /**
      * the normalization function to use to normalize property names. Can also be a String with values "titleCase",
      * "pascalCase", "camelCase", "hyphenated" or "none".
      */
    vNorm: js.Function
    ): js.Array[js.Object] = js.native
  }
}
