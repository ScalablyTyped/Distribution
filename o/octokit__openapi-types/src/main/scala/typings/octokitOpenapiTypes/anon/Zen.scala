package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zen extends StObject {
  
  /**
    * Webhook
    * @description The webhook that is being pinged
    */
  var hook: js.UndefOr[Pingurl] = js.undefined
  
  /** @description The ID of the webhook that triggered the ping. */
  var hook_id: js.UndefOr[Double] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
  
  /** @description Random string of GitHub zen. */
  var zen: js.UndefOr[String] = js.undefined
}
object Zen {
  
  inline def apply(): Zen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Zen] (val x: Self) extends AnyVal {
    
    inline def setHook(value: Pingurl): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setHook_idUndefined: Self = StObject.set(x, "hook_id", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setZen(value: String): Self = StObject.set(x, "zen", value.asInstanceOf[js.Any])
    
    inline def setZenUndefined: Self = StObject.set(x, "zen", js.undefined)
  }
}
