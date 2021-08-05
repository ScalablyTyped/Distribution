package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMetadata extends StObject {
  
  /** Optional. The type of device used by the job seeker at the time of the call to the service. */
  var deviceInfo: js.UndefOr[DeviceInfo] = js.undefined
  
  /**
    * Required. The client-defined scope or source of the service call, which typically is the domain on which the service has been implemented and is currently being run. For example, if
    * the service is being run by client *Foo, Inc.*, on job board www.foo.com and career site www.bar.com, then this field is set to "foo.com" for use on the job board, and "bar.com" for
    * use on the career site. If this field isn't available for some reason, send "UNKNOWN". Any improvements to the model for a particular tenant site rely on this field being set
    * correctly to a domain. The maximum number of allowed characters is 255.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A unique session identification string. A session is defined as the duration of an end user's interaction with the service over a certain period. Obfuscate this field for
    * privacy concerns before providing it to the service. If this field is not available for some reason, send "UNKNOWN". Note that any improvements to the model for a particular tenant
    * site, rely on this field being set correctly to some unique session_id. The maximum number of allowed characters is 255.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A unique user identification string, as determined by the client. To have the strongest positive impact on search quality make sure the client-level is unique. Obfuscate
    * this field for privacy concerns before providing it to the service. If this field is not available for some reason, send "UNKNOWN". Note that any improvements to the model for a
    * particular tenant site, rely on this field being set correctly to a unique user_id. The maximum number of allowed characters is 255.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object RequestMetadata {
  
  inline def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  
  extension [Self <: RequestMetadata](x: Self) {
    
    inline def setDeviceInfo(value: DeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
