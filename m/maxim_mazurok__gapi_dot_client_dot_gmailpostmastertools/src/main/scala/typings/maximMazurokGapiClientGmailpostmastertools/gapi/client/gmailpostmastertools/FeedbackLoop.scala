package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedbackLoop extends js.Object {
  
  /** Feedback loop identifier that uniquely identifies individual campaigns. */
  var id: js.UndefOr[String] = js.native
  
  /** The ratio of user marked spam messages with the identifier vs the total number of inboxed messages with that identifier. */
  var spamRatio: js.UndefOr[Double] = js.native
}
object FeedbackLoop {
  
  @scala.inline
  def apply(): FeedbackLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackLoop]
  }
  
  @scala.inline
  implicit class FeedbackLoopOps[Self <: FeedbackLoop] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSpamRatio(value: Double): Self = this.set("spamRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpamRatio: Self = this.set("spamRatio", js.undefined)
  }
}
