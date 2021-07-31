package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubConfig extends StObject {
  
  /** The format of the Cloud Pub/Sub messages. */
  var messageFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of the service account used for publishing Cloud Pub/Sub messages. This service account needs to be in the same project as the PubsubConfig. When added, the caller
    * needs to have iam.serviceAccounts.actAs permission on this service account. If unspecified, it defaults to the compute engine default service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** A topic of Cloud Pub/Sub. Values are of the form `projects//topics/`. The project needs to be the same project as this config is in. */
  var topic: js.UndefOr[String] = js.undefined
}
object PubsubConfig {
  
  @scala.inline
  def apply(): PubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubConfig]
  }
  
  @scala.inline
  implicit class PubsubConfigMutableBuilder[Self <: PubsubConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageFormat(value: String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
