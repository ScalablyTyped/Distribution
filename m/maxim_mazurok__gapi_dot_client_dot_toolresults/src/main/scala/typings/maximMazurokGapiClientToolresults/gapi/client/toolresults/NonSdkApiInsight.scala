package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApiInsight extends js.Object {
  
  /** Optional sample stack traces, for which this insight applies (there should be at least one). */
  var exampleTraceMessages: js.UndefOr[js.Array[String]] = js.native
  
  /** A unique ID, to be used for determining the effectiveness of this particular insight in the context of a matcher. (required) */
  var matcherId: js.UndefOr[String] = js.native
  
  /** An insight indicating that the hidden API usage originates from a Google-provided library. */
  var pendingGoogleUpdateInsight: js.UndefOr[PendingGoogleUpdateInsight] = js.native
  
  /** An insight indicating that the hidden API usage originates from the use of a library that needs to be upgraded. */
  var upgradeInsight: js.UndefOr[UpgradeInsight] = js.native
}
object NonSdkApiInsight {
  
  @scala.inline
  def apply(): NonSdkApiInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiInsight]
  }
  
  @scala.inline
  implicit class NonSdkApiInsightOps[Self <: NonSdkApiInsight] (val x: Self) extends AnyVal {
    
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
    def setExampleTraceMessagesVarargs(value: String*): Self = this.set("exampleTraceMessages", js.Array(value :_*))
    
    @scala.inline
    def setExampleTraceMessages(value: js.Array[String]): Self = this.set("exampleTraceMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleTraceMessages: Self = this.set("exampleTraceMessages", js.undefined)
    
    @scala.inline
    def setMatcherId(value: String): Self = this.set("matcherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatcherId: Self = this.set("matcherId", js.undefined)
    
    @scala.inline
    def setPendingGoogleUpdateInsight(value: PendingGoogleUpdateInsight): Self = this.set("pendingGoogleUpdateInsight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingGoogleUpdateInsight: Self = this.set("pendingGoogleUpdateInsight", js.undefined)
    
    @scala.inline
    def setUpgradeInsight(value: UpgradeInsight): Self = this.set("upgradeInsight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeInsight: Self = this.set("upgradeInsight", js.undefined)
  }
}
