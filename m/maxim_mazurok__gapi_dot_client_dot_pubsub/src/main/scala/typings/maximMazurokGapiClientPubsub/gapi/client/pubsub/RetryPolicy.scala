package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryPolicy extends js.Object {
  
  /** The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds. */
  var maximumBackoff: js.UndefOr[String] = js.native
  
  /** The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds. */
  var minimumBackoff: js.UndefOr[String] = js.native
}
object RetryPolicy {
  
  @scala.inline
  def apply(): RetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryPolicy]
  }
  
  @scala.inline
  implicit class RetryPolicyOps[Self <: RetryPolicy] (val x: Self) extends AnyVal {
    
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
    def setMaximumBackoff(value: String): Self = this.set("maximumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBackoff: Self = this.set("maximumBackoff", js.undefined)
    
    @scala.inline
    def setMinimumBackoff(value: String): Self = this.set("minimumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumBackoff: Self = this.set("minimumBackoff", js.undefined)
  }
}
