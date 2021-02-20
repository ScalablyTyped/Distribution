package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApiUsageViolation extends StObject {
  
  /** Signatures of a subset of those hidden API's. */
  var apiSignatures: js.UndefOr[js.Array[String]] = js.native
  
  /** Total number of unique hidden API's accessed. */
  var uniqueApis: js.UndefOr[Double] = js.native
}
object NonSdkApiUsageViolation {
  
  @scala.inline
  def apply(): NonSdkApiUsageViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiUsageViolation]
  }
  
  @scala.inline
  implicit class NonSdkApiUsageViolationMutableBuilder[Self <: NonSdkApiUsageViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSignatures(value: js.Array[String]): Self = StObject.set(x, "apiSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSignaturesUndefined: Self = StObject.set(x, "apiSignatures", js.undefined)
    
    @scala.inline
    def setApiSignaturesVarargs(value: String*): Self = StObject.set(x, "apiSignatures", js.Array(value :_*))
    
    @scala.inline
    def setUniqueApis(value: Double): Self = StObject.set(x, "uniqueApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueApisUndefined: Self = StObject.set(x, "uniqueApis", js.undefined)
  }
}
