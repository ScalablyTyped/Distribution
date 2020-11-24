package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubConfig extends js.Object {
  
  /** The format of the Cloud Pub/Sub messages. */
  var messageFormat: js.UndefOr[String] = js.native
  
  /**
    * Email address of the service account used for publishing Cloud Pub/Sub messages. This service account needs to be in the same project as the PubsubConfig. When added, the caller
    * needs to have iam.serviceAccounts.actAs permission on this service account. If unspecified, it defaults to the compute engine default service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /** A topic of Cloud Pub/Sub. Values are of the form `projects//topics/`. The project needs to be the same project as this config is in. */
  var topic: js.UndefOr[String] = js.native
}
object PubsubConfig {
  
  @scala.inline
  def apply(): PubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubConfig]
  }
  
  @scala.inline
  implicit class PubsubConfigOps[Self <: PubsubConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessageFormat(value: String): Self = this.set("messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageFormat: Self = this.set("messageFormat", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
