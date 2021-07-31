package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureInfo extends StObject {
  
  // Classification of why a call or portion of a call failed.
  var reason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The stage when the failure occurred. Possible values are: unknown, callSetup, midcall, unknownFutureValue.
  var stage: js.UndefOr[FailureStage] = js.undefined
}
object FailureInfo {
  
  @scala.inline
  def apply(): FailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureInfo]
  }
  
  @scala.inline
  implicit class FailureInfoMutableBuilder[Self <: FailureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: NullableOption[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = StObject.set(x, "reason", null)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStage(value: FailureStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
