package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  /** The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id} */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared
    * as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
    */
  var throughputCapacity: js.UndefOr[String] = js.undefined
}
object Reservation {
  
  inline def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reservation] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThroughputCapacity(value: String): Self = StObject.set(x, "throughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setThroughputCapacityUndefined: Self = StObject.set(x, "throughputCapacity", js.undefined)
  }
}
