package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StoredInfoTypeVersion extends StObject {
  
  /** StoredInfoType configuration. */
  var config: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeConfig] = js.undefined
  
  /** Create timestamp of the version. Read-only, determined by the system when the version is created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be
    * displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user's Google Cloud Storage bucket, and if this
    * data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the
    * UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
    */
  var errors: js.UndefOr[js.Array[GooglePrivacyDlpV2Error]] = js.undefined
  
  /** Stored info type version state. Read-only, updated by the system during dictionary creation. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Statistics about this storedInfoType version. */
  var stats: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeStats] = js.undefined
}
object GooglePrivacyDlpV2StoredInfoTypeVersion {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StoredInfoTypeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeVersion]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StoredInfoTypeVersionMutableBuilder[Self <: GooglePrivacyDlpV2StoredInfoTypeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: GooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[GooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStats(value: GooglePrivacyDlpV2StoredInfoTypeStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
