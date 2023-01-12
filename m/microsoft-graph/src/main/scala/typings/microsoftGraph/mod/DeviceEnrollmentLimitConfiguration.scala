package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentLimitConfiguration
  extends StObject
     with DeviceEnrollmentConfiguration {
  
  // The maximum number of devices that a user can enroll
  var limit: js.UndefOr[Double] = js.undefined
}
object DeviceEnrollmentLimitConfiguration {
  
  inline def apply(): DeviceEnrollmentLimitConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentLimitConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceEnrollmentLimitConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
