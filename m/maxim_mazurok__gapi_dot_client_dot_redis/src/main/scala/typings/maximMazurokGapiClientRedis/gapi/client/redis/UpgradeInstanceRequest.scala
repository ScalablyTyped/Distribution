package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInstanceRequest extends StObject {
  
  /** Required. Specifies the target version of Redis software to upgrade to. */
  var redisVersion: js.UndefOr[String] = js.undefined
}
object UpgradeInstanceRequest {
  
  inline def apply(): UpgradeInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setRedisVersion(value: String): Self = StObject.set(x, "redisVersion", value.asInstanceOf[js.Any])
    
    inline def setRedisVersionUndefined: Self = StObject.set(x, "redisVersion", js.undefined)
  }
}
