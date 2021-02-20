package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApi extends StObject {
  
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
  implicit class NonSdkApiMutableBuilder[Self <: NonSdkApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSignature(value: String): Self = StObject.set(x, "apiSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSignatureUndefined: Self = StObject.set(x, "apiSignature", js.undefined)
    
    @scala.inline
    def setExampleStackTraces(value: js.Array[String]): Self = StObject.set(x, "exampleStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleStackTracesUndefined: Self = StObject.set(x, "exampleStackTraces", js.undefined)
    
    @scala.inline
    def setExampleStackTracesVarargs(value: String*): Self = StObject.set(x, "exampleStackTraces", js.Array(value :_*))
    
    @scala.inline
    def setInsights(value: js.Array[NonSdkApiInsight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    @scala.inline
    def setInsightsVarargs(value: NonSdkApiInsight*): Self = StObject.set(x, "insights", js.Array(value :_*))
    
    @scala.inline
    def setInvocationCount(value: Double): Self = StObject.set(x, "invocationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationCountUndefined: Self = StObject.set(x, "invocationCount", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
  }
}
