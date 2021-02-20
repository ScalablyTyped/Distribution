package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2PublishToPubSub extends StObject {
  
  /**
    * Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access rights to the DLP API service account executing the long running DlpJob sending the
    * notifications. Format is projects/{project}/topics/{topic}.
    */
  var topic: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2PublishToPubSub {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2PublishToPubSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PublishToPubSub]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2PublishToPubSubMutableBuilder[Self <: GooglePrivacyDlpV2PublishToPubSub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
