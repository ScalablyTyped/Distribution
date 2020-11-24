package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFeedback extends js.Object {
  
  /**
    * The rating provided by the user of this endpoint about the quality of this Session. Possible values are: notRated, bad,
    * poor, fair, good, excellent, unknownFutureValue.
    */
  var rating: js.UndefOr[UserFeedbackRating] = js.native
  
  // The feedback text provided by the user of this endpoint for the session.
  var text: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties.
    * The property names should not be relied upon since they may change depending on what tokens are offered to the user.
    */
  var tokens: js.UndefOr[NullableOption[FeedbackTokenSet]] = js.native
}
object UserFeedback {
  
  @scala.inline
  def apply(): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFeedback]
  }
  
  @scala.inline
  implicit class UserFeedbackOps[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
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
    def setRating(value: UserFeedbackRating): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setText(value: NullableOption[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    
    @scala.inline
    def setTokens(value: NullableOption[FeedbackTokenSet]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    
    @scala.inline
    def setTokensNull: Self = this.set("tokens", null)
  }
}
