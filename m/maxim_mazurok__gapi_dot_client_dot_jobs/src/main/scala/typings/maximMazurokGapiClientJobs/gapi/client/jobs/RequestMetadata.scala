package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMetadata extends StObject {
  
  /**
    * Only set when any of domain, session_id and user_id isn't available for some reason. It is highly recommended not to set this field and provide accurate domain, session_id and
    * user_id for the best service experience.
    */
  var allowMissingIds: js.UndefOr[Boolean] = js.undefined
  
  /** The type of device used by the job seeker at the time of the call to the service. */
  var deviceInfo: js.UndefOr[DeviceInfo] = js.undefined
  
  /**
    * Required if allow_missing_ids is unset or `false`. The client-defined scope or source of the service call, which typically is the domain on which the service has been implemented
    * and is currently being run. For example, if the service is being run by client *Foo, Inc.*, on job board www.foo.com and career site www.bar.com, then this field is set to "foo.com"
    * for use on the job board, and "bar.com" for use on the career site. Note that any improvements to the model for a particular tenant site rely on this field being set correctly to a
    * unique domain. The maximum number of allowed characters is 255.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Required if allow_missing_ids is unset or `false`. A unique session identification string. A session is defined as the duration of an end user's interaction with the service over a
    * certain period. Obfuscate this field for privacy concerns before providing it to the service. Note that any improvements to the model for a particular tenant site rely on this field
    * being set correctly to a unique session ID. The maximum number of allowed characters is 255.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required if allow_missing_ids is unset or `false`. A unique user identification string, as determined by the client. To have the strongest positive impact on search quality make
    * sure the client-level is unique. Obfuscate this field for privacy concerns before providing it to the service. Note that any improvements to the model for a particular tenant site
    * rely on this field being set correctly to a unique user ID. The maximum number of allowed characters is 255.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object RequestMetadata {
  
  inline def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestMetadata] (val x: Self) extends AnyVal {
    
    inline def setAllowMissingIds(value: Boolean): Self = StObject.set(x, "allowMissingIds", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingIdsUndefined: Self = StObject.set(x, "allowMissingIds", js.undefined)
    
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
