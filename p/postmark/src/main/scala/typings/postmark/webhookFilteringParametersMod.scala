package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/webhooks/WebhookFilteringParameters", JSImport.Namespace)
@js.native
object webhookFilteringParametersMod extends js.Object {
  
  @js.native
  class WebhookFilteringParameters protected () extends js.Object {
    def this(messageStream: String) = this()
    
    var messageStream: js.UndefOr[String] = js.native
  }
}
