package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2FindingLimits extends StObject {
  
  /** Configuration of findings limit given for specified infoTypes. */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeLimit]] = js.native
  
  /**
    * Max number of findings that will be returned for each item scanned. When set within `InspectJobConfig`, the maximum returned is 2000 regardless if this is set higher. When set
    * within `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double] = js.native
  
  /** Max number of findings that will be returned per request/job. When set within `InspectContentRequest`, the maximum returned is 2000 regardless if this is set higher. */
  var maxFindingsPerRequest: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2FindingLimits {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FindingLimits]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FindingLimitsMutableBuilder[Self <: GooglePrivacyDlpV2FindingLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxFindingsPerInfoType(value: js.Array[GooglePrivacyDlpV2InfoTypeLimit]): Self = StObject.set(x, "maxFindingsPerInfoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFindingsPerInfoTypeUndefined: Self = StObject.set(x, "maxFindingsPerInfoType", js.undefined)
    
    @scala.inline
    def setMaxFindingsPerInfoTypeVarargs(value: GooglePrivacyDlpV2InfoTypeLimit*): Self = StObject.set(x, "maxFindingsPerInfoType", js.Array(value :_*))
    
    @scala.inline
    def setMaxFindingsPerItem(value: Double): Self = StObject.set(x, "maxFindingsPerItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFindingsPerItemUndefined: Self = StObject.set(x, "maxFindingsPerItem", js.undefined)
    
    @scala.inline
    def setMaxFindingsPerRequest(value: Double): Self = StObject.set(x, "maxFindingsPerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFindingsPerRequestUndefined: Self = StObject.set(x, "maxFindingsPerRequest", js.undefined)
  }
}
