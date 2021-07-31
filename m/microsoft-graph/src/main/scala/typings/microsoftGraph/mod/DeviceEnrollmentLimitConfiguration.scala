package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentLimitConfiguration
  extends StObject
     with DeviceEnrollmentConfiguration {
  
  // Not yet documented
  var limit: js.UndefOr[Double] = js.undefined
}
object DeviceEnrollmentLimitConfiguration {
  
  @scala.inline
  def apply(): DeviceEnrollmentLimitConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentLimitConfiguration]
  }
  
  @scala.inline
  implicit class DeviceEnrollmentLimitConfigurationMutableBuilder[Self <: DeviceEnrollmentLimitConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
