package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItemFlight extends js.Object {
  
  /**
    * The flight start and end dates of the line item. They are resolved relative to the parent advertiser's time zone. * Required when flight_date_type is
    * `LINE_ITEM_FLIGHT_DATE_TYPE_CUSTOM`. Output only otherwise. * When creating a new flight, both `start_date` and `end_date` must be in the future. * An existing flight with a
    * `start_date` in the past has a mutable `end_date` but an immutable `start_date`. * `end_date` must be the `start_date` or later, both before the year 2037.
    */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /** Required. The type of the line item's flight dates. */
  var flightDateType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the manual trigger associated with the line item. * Required when flight_date_type is `LINE_ITEM_FLIGHT_DATE_TYPE_TRIGGER`. Must not be set otherwise. * When set, the line
    * item's flight dates are inherited from its parent insertion order. * Active line items will spend when the selected trigger is activated within the parent insertion order's flight
    * dates.
    */
  var triggerId: js.UndefOr[String] = js.native
}
object LineItemFlight {
  
  @scala.inline
  def apply(): LineItemFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemFlight]
  }
  
  @scala.inline
  implicit class LineItemFlightOps[Self <: LineItemFlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setFlightDateType(value: String): Self = this.set("flightDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlightDateType: Self = this.set("flightDateType", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
  }
}
