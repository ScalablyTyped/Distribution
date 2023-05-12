package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  /**
    * Whether the date is formatted and parsed as UTC instead of the configured time zone
    */
  var UTC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This format option cannot be overwritten and is always `true`
    */
  var interval: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the end value of the interval can be omitted
    */
  var singleIntervalValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional set of options used to create a second `DateFormat` object for conversions between string
    * values in the data source (e.g. model) and `Date`. This second format object is used to convert both
    * interval parts from a model `string` to `Date` before converting both of the `Date`(s) to `string` with
    * the primary format object. Vice versa, this 'source' format is also used to format the already parsed
    * external value (e.g. user input) into the string format that is expected by the data source. For a list
    * of all available options, see {@link sap.ui.core.format.DateFormat.getDateInstance}. If an empty object
    * is given, the default is the ISO date notation (yyyy-MM-dd).
    */
  var source: js.UndefOr[Pattern] = js.undefined
}
object Interval {
  
  inline def apply(): Interval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setSingleIntervalValue(value: Boolean): Self = StObject.set(x, "singleIntervalValue", value.asInstanceOf[js.Any])
    
    inline def setSingleIntervalValueUndefined: Self = StObject.set(x, "singleIntervalValue", js.undefined)
    
    inline def setSource(value: Pattern): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUTC(value: Boolean): Self = StObject.set(x, "UTC", value.asInstanceOf[js.Any])
    
    inline def setUTCUndefined: Self = StObject.set(x, "UTC", js.undefined)
  }
}
