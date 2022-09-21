package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeInstanceMetadata extends StObject {
  
  /**
    * Specifies the expiration behavior of a free instance. The default of ExpireBehavior is `REMOVE_AFTER_GRACE_PERIOD`. This can be modified during or after creation, and before
    * expiration.
    */
  var expireBehavior: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Timestamp after which the instance will either be upgraded or scheduled for deletion after a grace period. ExpireBehavior is used to choose between upgrading or
    * scheduling the free instance for deletion. This timestamp is set during the creation of a free instance.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. If present, the timestamp at which the free instance was upgraded to a provisioned instance. */
  var upgradeTime: js.UndefOr[String] = js.undefined
}
object FreeInstanceMetadata {
  
  inline def apply(): FreeInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeInstanceMetadata]
  }
  
  extension [Self <: FreeInstanceMetadata](x: Self) {
    
    inline def setExpireBehavior(value: String): Self = StObject.set(x, "expireBehavior", value.asInstanceOf[js.Any])
    
    inline def setExpireBehaviorUndefined: Self = StObject.set(x, "expireBehavior", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setUpgradeTime(value: String): Self = StObject.set(x, "upgradeTime", value.asInstanceOf[js.Any])
    
    inline def setUpgradeTimeUndefined: Self = StObject.set(x, "upgradeTime", js.undefined)
  }
}
