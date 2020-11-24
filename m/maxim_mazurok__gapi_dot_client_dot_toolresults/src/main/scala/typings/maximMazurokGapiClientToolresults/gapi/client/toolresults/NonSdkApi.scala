package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApi extends js.Object {
  
  /** The signature of the Non-SDK API */
  var apiSignature: js.UndefOr[String] = js.native
  
  /** Example stack traces of this API being called. */
  var exampleStackTraces: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional debugging insights for non-SDK API violations. */
  var insights: js.UndefOr[js.Array[NonSdkApiInsight]] = js.native
  
  /** The total number of times this API was observed to have been called. */
  var invocationCount: js.UndefOr[Double] = js.native
  
  /** Which list this API appears on */
  var list: js.UndefOr[String] = js.native
}
object NonSdkApi {
  
  @scala.inline
  def apply(): NonSdkApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApi]
  }
  
  @scala.inline
  implicit class NonSdkApiOps[Self <: NonSdkApi] (val x: Self) extends AnyVal {
    
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
    def setApiSignature(value: String): Self = this.set("apiSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiSignature: Self = this.set("apiSignature", js.undefined)
    
    @scala.inline
    def setExampleStackTracesVarargs(value: String*): Self = this.set("exampleStackTraces", js.Array(value :_*))
    
    @scala.inline
    def setExampleStackTraces(value: js.Array[String]): Self = this.set("exampleStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleStackTraces: Self = this.set("exampleStackTraces", js.undefined)
    
    @scala.inline
    def setInsightsVarargs(value: NonSdkApiInsight*): Self = this.set("insights", js.Array(value :_*))
    
    @scala.inline
    def setInsights(value: js.Array[NonSdkApiInsight]): Self = this.set("insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsights: Self = this.set("insights", js.undefined)
    
    @scala.inline
    def setInvocationCount(value: Double): Self = this.set("invocationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationCount: Self = this.set("invocationCount", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
  }
}
