package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MirrorConfig extends StObject {
  
  /** ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring. */
  var deployKeyId: js.UndefOr[String] = js.undefined
  
  /** URL of the main repository at the other hosting service. */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving
    * notifications, and thereby disabling mirroring.
    */
  var webhookId: js.UndefOr[String] = js.undefined
}
object MirrorConfig {
  
  inline def apply(): MirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorConfig]
  }
  
  extension [Self <: MirrorConfig](x: Self) {
    
    inline def setDeployKeyId(value: String): Self = StObject.set(x, "deployKeyId", value.asInstanceOf[js.Any])
    
    inline def setDeployKeyIdUndefined: Self = StObject.set(x, "deployKeyId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebhookId(value: String): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    inline def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
