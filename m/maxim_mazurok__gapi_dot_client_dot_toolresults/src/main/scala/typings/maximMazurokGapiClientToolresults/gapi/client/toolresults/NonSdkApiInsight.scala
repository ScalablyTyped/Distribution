package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonSdkApiInsight extends StObject {
  
  /** Optional sample stack traces, for which this insight applies (there should be at least one). */
  var exampleTraceMessages: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A unique ID, to be used for determining the effectiveness of this particular insight in the context of a matcher. (required) */
  var matcherId: js.UndefOr[String] = js.undefined
  
  /** An insight indicating that the hidden API usage originates from a Google-provided library. */
  var pendingGoogleUpdateInsight: js.UndefOr[PendingGoogleUpdateInsight] = js.undefined
  
  /** An insight indicating that the hidden API usage originates from the use of a library that needs to be upgraded. */
  var upgradeInsight: js.UndefOr[UpgradeInsight] = js.undefined
}
object NonSdkApiInsight {
  
  @scala.inline
  def apply(): NonSdkApiInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiInsight]
  }
  
  @scala.inline
  implicit class NonSdkApiInsightMutableBuilder[Self <: NonSdkApiInsight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExampleTraceMessages(value: js.Array[String]): Self = StObject.set(x, "exampleTraceMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleTraceMessagesUndefined: Self = StObject.set(x, "exampleTraceMessages", js.undefined)
    
    @scala.inline
    def setExampleTraceMessagesVarargs(value: String*): Self = StObject.set(x, "exampleTraceMessages", js.Array(value :_*))
    
    @scala.inline
    def setMatcherId(value: String): Self = StObject.set(x, "matcherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherIdUndefined: Self = StObject.set(x, "matcherId", js.undefined)
    
    @scala.inline
    def setPendingGoogleUpdateInsight(value: PendingGoogleUpdateInsight): Self = StObject.set(x, "pendingGoogleUpdateInsight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingGoogleUpdateInsightUndefined: Self = StObject.set(x, "pendingGoogleUpdateInsight", js.undefined)
    
    @scala.inline
    def setUpgradeInsight(value: UpgradeInsight): Self = StObject.set(x, "upgradeInsight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeInsightUndefined: Self = StObject.set(x, "upgradeInsight", js.undefined)
  }
}
