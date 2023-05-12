package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Alias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatautilsMod extends Shortcut {
  
  @JSImport("sap/ui/model/odata/ODataUtils", JSImport.Default)
  @js.native
  val default: ODataUtils = js.native
  
  @js.native
  trait ODataUtils extends StObject {
    
    /**
      * @SINCE 1.29.1
      *
      * Compares the given OData values based on their type. All date and time types can also be compared with
      * a number. This number is then interpreted as the number of milliseconds that the corresponding date or
      * time object should hold.
      *
      * @returns the result of the compare: `0` if the values are equal, `-1` if the first value is smaller,
      * `1` if the first value is larger, `NaN` if they cannot be compared
      */
    def compare(
      /**
      * the first value to compare
      */
    vValue1: Any,
      /**
      * the second value to compare
      */
    vValue2: Any
    ): int = js.native
    def compare(
      /**
      * the first value to compare
      */
    vValue1: Any,
      /**
      * the second value to compare
      */
    vValue2: Any,
      /**
      * if `true`, the string values `vValue1` and `vValue2` are compared as a decimal number (only sign, integer
      * and fraction digits; no exponential format). Otherwise they are recognized by looking at their types.
      */
    bAsDecimal: Boolean
    ): int = js.native
    
    /**
      * Formats a JavaScript value according to the given
      * EDM type.
      *
      * @returns The formatted value
      */
    def formatValue(
      /**
      * The value to format
      */
    vValue: Any,
      /**
      * The EDM type (e.g. Edm.Decimal)
      */
    sType: String,
      /**
      * Whether strings gets compared case sensitive or not
      */
    bCaseSensitive: Boolean
    ): String = js.native
    
    /**
      * @SINCE 1.29.1
      *
      * Returns a comparator function optimized for the given EDM type.
      *
      * @returns the comparator function taking two values of the given type and returning `0` if the values
      * are equal, `-1` if the first value is smaller, `1` if the first value is larger and `NaN` if they cannot
      * be compared (e.g. one value is `null` or `undefined`)
      */
    def getComparator(/**
      * the EDM type
      */
    sEdmType: String): js.Function = js.native
    
    def setOrigin(
      /**
      * the URL which will be enriched with an origin
      */
    sServiceURL: String,
      /**
      * if string then it is asumed its the system alias, else if the argument is an object then additional Parameters
      * can be given
      */
    vParameters: String
    ): String = js.native
    /**
      * @SINCE 1.30.7
      *
      * Adds an origin to the given service URL. If an origin is already present, it will only be replaced if
      * the parameters object contains the flag "force: true". In case the URL already contains URL parameters,
      * these will be kept. As a parameter, a sole alias is sufficient. The parameters vParameters.system and
      * vParameters.client however have to be given in pairs. In case all three origin specifying parameters
      * are given (system/client/alias), the alias has precedence.
      *
      * Examples: setOrigin("/backend/service/url/", "DEMO_123"); - result: /backend/service/url;o=DEMO_123/
      *
      * setOrigin("/backend/service/url;o=OTHERSYS8?myUrlParam=true&x=4", {alias: "DEMO_123", force: true});
      * - result /backend/service/url;o=DEMO_123?myUrlParam=true&x=4
      *
      * setOrigin("/backend/service;o=NOT_TOUCHED/url;v=2;o=OTHERSYS8;srv=XVC", {alias: "DEMO_123", force: true});
      * - result /backend/service;o=NOT_TOUCHED/url;v=2;o=DEMO_123;srv=XVC
      *
      * setOrigin("/backend/service/url/", {system: "DEMO", client: 134}); - result /backend/service/url;o=sid(DEMO.134)/
      *
      * @returns the service URL with the added origin.
      */
    def setOrigin(
      /**
      * the URL which will be enriched with an origin
      */
    sServiceURL: String,
      /**
      * if string then it is asumed its the system alias, else if the argument is an object then additional Parameters
      * can be given
      */
    vParameters: Alias
    ): String = js.native
  }
  
  type _To = ODataUtils
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelOdataOdatautilsMod.foo` */
  override def _to: ODataUtils = default
}
