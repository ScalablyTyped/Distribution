package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationConfig extends StObject {
  
  /** The Reservation to use for this topic's throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id} */
  var throughputReservation: js.UndefOr[String] = js.undefined
}
object ReservationConfig {
  
  inline def apply(): ReservationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservationConfig] (val x: Self) extends AnyVal {
    
    inline def setThroughputReservation(value: String): Self = StObject.set(x, "throughputReservation", value.asInstanceOf[js.Any])
    
    inline def setThroughputReservationUndefined: Self = StObject.set(x, "throughputReservation", js.undefined)
  }
}
