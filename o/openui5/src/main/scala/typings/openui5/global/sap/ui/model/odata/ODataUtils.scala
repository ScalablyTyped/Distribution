package typings.openui5.global.sap.ui.model.odata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ODataUtils {
  
  @JSGlobal("sap.ui.model.odata.ODataUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares the given OData values based on their type. All date and time types can also becompared
    * with a number. This number is then interpreted as the number of milliseconds thatthe corresponding
    * date or time object should hold.
    * @since 1.29.1
    * @param vValue1 the first value to compare
    * @param vValue2 the second value to compare
    * @param bAsDecimal if <code>true</code>, the string values <code>vValue1</code> and
    * <code>vValue2</code> are  compared as a decimal number (only sign, integer and fraction digits; no
    * exponential  format). Otherwise they are recognized by looking at their types.
    * @returns the result of the compare: <code>0</code> if the values are equal, <code>-1</code> if the 
    * first value is smaller, <code>1</code> if the first value is larger, <code>NaN</code> if  they
    * cannot be compared
    */
  inline def compare(vValue1: js.Any, vValue2: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(vValue1.asInstanceOf[js.Any], vValue2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compare(vValue1: js.Any, vValue2: js.Any, bAsDecimal: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(vValue1.asInstanceOf[js.Any], vValue2.asInstanceOf[js.Any], bAsDecimal.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Formats a JavaScript value according to the given<a
    * href="http://www.odata.org/documentation/odata-version-2-0/overview#AbstractTypeSystem">EDM
    * type</a>.
    * @param vValue the value to format
    * @param sType the EDM type (e.g. Edm.Decimal)
    * @returns the formatted value
    */
  inline def formatValue(vValue: js.Any, sType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValue")(vValue.asInstanceOf[js.Any], sType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns a comparator function optimized for the given EDM type.
    * @since 1.29.1
    * @param sEdmType the EDM type
    * @returns the comparator function taking two values of the given type and returning <code>0</code> 
    * if the values are equal, <code>-1</code> if the first value is smaller, <code>1</code> if  the first
    * value is larger and <code>NaN</code> if they cannot be compared (e.g. one value  is
    * <code>null</code> or <code>undefined</code>)
    */
  inline def getComparator(sEdmType: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getComparator")(sEdmType.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def setOrigin(sServiceURL: String, vParameters: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setOrigin")(sServiceURL.asInstanceOf[js.Any], vParameters.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Adds an origin to the given service URL.If an origin is already present, it will only be replaced if
    * the parameters object contains the flag "force: true".In case the URL already contains URL
    * parameters, these will be kept.As a parameter, a sole alias is sufficient. The parameters
    * vParameters.system and vParameters.client however have to be given in pairs.In case all three origin
    * specifying parameters are given (system/client/alias), the alias has
    * precedence.Examples:setOrigin("/backend/service/url/", "DEMO_123");- result:
    * /backend/service/url;o=DEMO_123/setOrigin("/backend/service/url;o=OTHERSYS8?myUrlParam=true&x=4",
    * {alias: "DEMO_123", force: true});- result
    * /backend/service/url;o=DEMO_123?myUrlParam=true&x=4setOrigin("/backend/service/url/", {system:
    * "DEMO", client: 134});- result /backend/service/url;o=sid(DEMO.134)/
    * @since 1.30.7
    * @param sServiceURL the URL which will be enriched with an origin
    * @param vParameters if string then it is asumed its the system alias, else if the argument is an
    * object then additional Parameters can be given
    * @returns the service URL with the added origin.
    */
  inline def setOrigin(sServiceURL: String, vParameters: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setOrigin")(sServiceURL.asInstanceOf[js.Any], vParameters.asInstanceOf[js.Any])).asInstanceOf[String]
}
