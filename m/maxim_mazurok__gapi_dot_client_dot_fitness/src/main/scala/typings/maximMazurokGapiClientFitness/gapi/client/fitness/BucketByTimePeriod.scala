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
  
  @scala.inline
  def apply(): BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketByTimePeriod]
  }
  
  @scala.inline
  implicit class BucketByTimePeriodMutableBuilder[Self <: BucketByTimePeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
