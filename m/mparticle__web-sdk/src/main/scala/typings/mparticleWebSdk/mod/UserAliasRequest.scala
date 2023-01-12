package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAliasRequest extends StObject {
  
  var destinationMpid: String
  
  var endTime: Double
  
  var scope: js.UndefOr[String] = js.undefined
  
  var sourceMpid: String
  
  var startTime: Double
}
object UserAliasRequest {
  
  inline def apply(destinationMpid: String, endTime: Double, sourceMpid: String, startTime: Double): UserAliasRequest = {
    val __obj = js.Dynamic.literal(destinationMpid = destinationMpid.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], sourceMpid = sourceMpid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationMpid(value: String): Self = StObject.set(x, "destinationMpid", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSourceMpid(value: String): Self = StObject.set(x, "sourceMpid", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
