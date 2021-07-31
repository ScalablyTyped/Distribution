package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2BucketingConfig extends StObject {
  
  /** Set of buckets. Ranges must be non-overlapping. */
  var buckets: js.UndefOr[js.Array[GooglePrivacyDlpV2Bucket]] = js.undefined
}
object GooglePrivacyDlpV2BucketingConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BucketingConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BucketingConfigMutableBuilder[Self <: GooglePrivacyDlpV2BucketingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[GooglePrivacyDlpV2Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: GooglePrivacyDlpV2Bucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
  }
}
