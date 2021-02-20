package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushConfig extends StObject {
  
  /**
    * Endpoint configuration attributes that can be used to control different aspects of the message delivery. The only currently supported attribute is `x-goog-version`, which you can
    * use to change the format of the pushed message. This attribute indicates the version of the data expected by the endpoint. This controls the shape of the pushed message (i.e., its
    * fields and metadata). If not present during the `CreateSubscription` call, it will default to the version of the Pub/Sub API used to make such call. If not present in a
    * `ModifyPushConfig` call, its value will not be changed. `GetSubscription` calls will always return a valid version, even if the subscription was created without this attribute. The
    * only supported values for the `x-goog-version` attribute are: * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined
    * in the v1 Pub/Sub API. For example: attributes { "x-goog-version": "v1" }
    */
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.PushConfig with TopLevel[js.Any]
  ] = js.native
  
  /** If specified, Pub/Sub will generate and attach an OIDC JWT token as an `Authorization` header in the HTTP request for every pushed message. */
  var oidcToken: js.UndefOr[OidcToken] = js.native
  
  /** A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use `https://example.com/push`. */
  var pushEndpoint: js.UndefOr[String] = js.native
}
object PushConfig {
  
  @scala.inline
  def apply(): PushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushConfig]
  }
  
  @scala.inline
  implicit class PushConfigMutableBuilder[Self <: PushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.PushConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setOidcToken(value: OidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    @scala.inline
    def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
