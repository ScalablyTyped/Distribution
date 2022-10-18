package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatautilsMod extends Shortcut {
  
  @JSImport("sap/ui/model/odata/v4/ODataUtils", JSImport.Default)
  @js.native
  val default: ODataUtils = js.native
  
  /**
    * @SINCE 1.43.0
    *
    * A collection of methods which help to consume OData V4 services.
    */
  @js.native
  trait ODataUtils extends StObject {
    
    /**
      * @SINCE 1.43.0
      *
      * Compares the given OData values.
      *
      * @returns The result of the comparison: `0` if the values are equal, `1` if the first value is larger,
      * `-1` if the second value is larger, `NaN` if they cannot be compared
      */
    def compare(
      /**
      * The first value to compare
      */
    vValue1: Any,
      /**
      * The second value to compare
      */
    vValue2: Any
    ): Double = js.native
    def compare(
      /**
      * The first value to compare
      */
    vValue1: Any,
      /**
      * The second value to compare
      */
    vValue2: Any,
      /**
      * If `true` or "Decimal", the string values `vValue1` and `vValue2` are assumed to be valid "Edm.Decimal"
      * or "Edm.Int64" values and are compared as a decimal number (only sign, integer and fraction digits; no
      * exponential format). If "DateTime", the string values `vValue1` and `vValue2` are assumed to be valid
      * "Edm.DateTimeOffset" values and are compared based on the corresponding number of milliseconds since
      * 1 January, 1970 UTC. Otherwise the values are compared with the JavaScript operators `===` and `>`.
      */
    vEdmType: String
    ): Double = js.native
    def compare(
      /**
      * The first value to compare
      */
    vValue1: Any,
      /**
      * The second value to compare
      */
    vValue2: Any,
      /**
      * If `true` or "Decimal", the string values `vValue1` and `vValue2` are assumed to be valid "Edm.Decimal"
      * or "Edm.Int64" values and are compared as a decimal number (only sign, integer and fraction digits; no
      * exponential format). If "DateTime", the string values `vValue1` and `vValue2` are assumed to be valid
      * "Edm.DateTimeOffset" values and are compared based on the corresponding number of milliseconds since
      * 1 January, 1970 UTC. Otherwise the values are compared with the JavaScript operators `===` and `>`.
      */
    vEdmType: Boolean
    ): Double = js.native
    
    /**
      * @SINCE 1.64.0
      *
      * Formats the given OData value into a literal suitable for usage in data binding paths and URLs.
      *
      * @returns The literal according to "OData Version 4.0 Part 2: URL Conventions" section "5.1.1.11.1 Primitive Literals"
      */
    def formatLiteral(
      /**
      * The value according to "OData JSON Format Version 4.0" section "7.1 Primitive Value"
      */
    vValue: Any,
      /**
      * The OData primitive type, for example "Edm.String"
      */
    sType: String
    ): String = js.native
    
    /**
      * @SINCE 1.43.0
      *
      * Parses an "Edm.Date" value and returns the corresponding JavaScript `Date` value (UTC with a time value
      * of "00:00:00").
      *
      * @returns The JavaScript `Date` value
      */
    def parseDate(/**
      * The "Edm.Date" value to parse
      */
    sDate: String): js.Date = js.native
    
    /**
      * @SINCE 1.43.0
      *
      * Parses an "Edm.DateTimeOffset" value and returns the corresponding JavaScript `Date` value.
      *
      * @returns The JavaScript `Date` value
      */
    def parseDateTimeOffset(/**
      * The "Edm.DateTimeOffset" value to parse
      */
    sDateTimeOffset: String): js.Date = js.native
    
    /**
      * @SINCE 1.43.0
      *
      * Parses an "Edm.TimeOfDay" value and returns the corresponding JavaScript `Date` value (UTC with a date
      * value of "1970-01-01").
      *
      * @returns The JavaScript `Date` value
      */
    def parseTimeOfDay(/**
      * The "Edm.TimeOfDay" value to parse
      */
    sTimeOfDay: String): js.Date = js.native
  }
  
  type _To = ODataUtils
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelOdataV4OdatautilsMod.foo` */
  override def _to: ODataUtils = default
}
