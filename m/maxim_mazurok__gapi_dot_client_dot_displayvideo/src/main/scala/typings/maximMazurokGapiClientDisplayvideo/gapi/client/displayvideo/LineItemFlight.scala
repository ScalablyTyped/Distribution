package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemFlight extends StObject {
  
  /**
    * The flight start and end dates of the line item. They are resolved relative to the parent advertiser's time zone. * Required when flight_date_type is
    * `LINE_ITEM_FLIGHT_DATE_TYPE_CUSTOM`. Output only otherwise. * When creating a new flight, both `start_date` and `end_date` must be in the future. * An existing flight with a
    * `start_date` in the past has a mutable `end_date` but an immutable `start_date`. * `end_date` must be the `start_date` or later, both before the year 2037.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** Required. The type of the line item's flight dates. */
  var flightDateType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the manual trigger associated with the line item. * Required when flight_date_type is `LINE_ITEM_FLIGHT_DATE_TYPE_TRIGGER`. Must not be set otherwise. * When set, the line
    * item's flight dates are inherited from its parent insertion order. * Active line items will spend when the selected trigger is activated within the parent insertion order's flight
    * dates.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object LineItemFlight {
  
  inline def apply(): LineItemFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemFlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineItemFlight] (val x: Self) extends AnyVal {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setFlightDateType(value: String): Self = StObject.set(x, "flightDateType", value.asInstanceOf[js.Any])
    
    inline def setFlightDateTypeUndefined: Self = StObject.set(x, "flightDateType", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
