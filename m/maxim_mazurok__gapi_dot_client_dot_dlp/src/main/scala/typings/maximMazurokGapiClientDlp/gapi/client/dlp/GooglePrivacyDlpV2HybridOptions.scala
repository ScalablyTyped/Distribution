package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridOptions extends js.Object {
  
  /** A short description of where the data is coming from. Will be stored once in the job. 256 max length. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression:
    * `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10
    * labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2HybridOptions with TopLevel[js.Any]
  ] = js.native
  
  /**
    * These are labels that each inspection request must include within their 'finding_labels' map. Request may contain others, but any missing one of these will be rejected. Label keys
    * must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
    */
  var requiredFindingLabelKeys: js.UndefOr[js.Array[String]] = js.native
  
  /** If the container is a table, additional information to make findings meaningful such as the columns that are primary keys. */
  var tableOptions: js.UndefOr[GooglePrivacyDlpV2TableOptions] = js.native
}
object GooglePrivacyDlpV2HybridOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridOptionsOps[Self <: GooglePrivacyDlpV2HybridOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2HybridOptions with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setRequiredFindingLabelKeysVarargs(value: String*): Self = this.set("requiredFindingLabelKeys", js.Array(value :_*))
    
    @scala.inline
    def setRequiredFindingLabelKeys(value: js.Array[String]): Self = this.set("requiredFindingLabelKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFindingLabelKeys: Self = this.set("requiredFindingLabelKeys", js.undefined)
    
    @scala.inline
    def setTableOptions(value: GooglePrivacyDlpV2TableOptions): Self = this.set("tableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOptions: Self = this.set("tableOptions", js.undefined)
  }
}
