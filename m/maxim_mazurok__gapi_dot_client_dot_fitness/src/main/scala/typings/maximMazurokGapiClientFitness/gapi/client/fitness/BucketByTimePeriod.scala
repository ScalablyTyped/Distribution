package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketByTimePeriod extends StObject {
  
  /** org.joda.timezone.DateTimeZone */
  var timeZoneId: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object BucketByTimePeriod {
  
  inline def apply(): BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketByTimePeriod]
  }
  
  extension [Self <: BucketByTimePeriod](x: Self) {
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
