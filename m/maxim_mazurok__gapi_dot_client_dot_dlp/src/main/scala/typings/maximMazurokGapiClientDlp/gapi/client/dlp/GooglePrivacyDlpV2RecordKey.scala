package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RecordKey extends js.Object {
  
  var bigQueryKey: js.UndefOr[GooglePrivacyDlpV2BigQueryKey] = js.native
  
  var datastoreKey: js.UndefOr[GooglePrivacyDlpV2DatastoreKey] = js.native
  
  /** Values of identifying columns in the given row. Order of values matches the order of `identifying_fields` specified in the scanning request. */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}
object GooglePrivacyDlpV2RecordKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordKeyOps[Self <: GooglePrivacyDlpV2RecordKey] (val x: Self) extends AnyVal {
    
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
    def setBigQueryKey(value: GooglePrivacyDlpV2BigQueryKey): Self = this.set("bigQueryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigQueryKey: Self = this.set("bigQueryKey", js.undefined)
    
    @scala.inline
    def setDatastoreKey(value: GooglePrivacyDlpV2DatastoreKey): Self = this.set("datastoreKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreKey: Self = this.set("datastoreKey", js.undefined)
    
    @scala.inline
    def setIdValuesVarargs(value: String*): Self = this.set("idValues", js.Array(value :_*))
    
    @scala.inline
    def setIdValues(value: js.Array[String]): Self = this.set("idValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdValues: Self = this.set("idValues", js.undefined)
  }
}
