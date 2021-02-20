package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MirrorConfig extends StObject {
  
  /** ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring. */
  var deployKeyId: js.UndefOr[String] = js.native
  
  /** URL of the main repository at the other hosting service. */
  var url: js.UndefOr[String] = js.native
  
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving
    * notifications, and thereby disabling mirroring.
    */
  var webhookId: js.UndefOr[String] = js.native
}
object MirrorConfig {
  
  @scala.inline
  def apply(): MirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorConfig]
  }
  
  @scala.inline
  implicit class MirrorConfigMutableBuilder[Self <: MirrorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployKeyId(value: String): Self = StObject.set(x, "deployKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployKeyIdUndefined: Self = StObject.set(x, "deployKeyId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWebhookId(value: String): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
