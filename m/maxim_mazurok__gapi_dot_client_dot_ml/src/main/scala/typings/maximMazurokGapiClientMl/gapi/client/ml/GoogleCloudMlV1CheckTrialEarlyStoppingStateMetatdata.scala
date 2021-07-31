package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata extends StObject {
  
  /** The time at which the operation was submitted. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the study that the trial belongs to. */
  var study: js.UndefOr[String] = js.undefined
  
  /** The trial name. */
  var trial: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata {
  
  @scala.inline
  def apply(): GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdataMutableBuilder[Self <: GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setStudy(value: String): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    @scala.inline
    def setTrial(value: String): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
