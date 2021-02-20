package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridFindingDetails extends StObject {
  
  /** Details about the container where the content being inspected is from. */
  var containerDetails: js.UndefOr[GooglePrivacyDlpV2Container] = js.native
  
  /**
    * Offset in bytes of the line, from the beginning of the file, where the finding is located. Populate if the item being scanned is only part of a bigger item, such as a shard of a
    * file and you want to track the absolute position of the finding.
    */
  var fileOffset: js.UndefOr[String] = js.native
  
  /**
    * Labels to represent user provided metadata about the data being inspected. If configured by the job, some key values may be required. The labels associated with `Finding`'s produced
    * by hybrid inspection. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be
    * between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples:
    * * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2HybridFindingDetails with TopLevel[js.Any]
  ] = js.native
  
  /** Offset of the row for tables. Populate if the row(s) being scanned are part of a bigger dataset and you want to keep track of their absolute position. */
  var rowOffset: js.UndefOr[String] = js.native
  
  /**
    * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys. If not known ahead of time, can also be set within each
    * inspect hybrid call and the two will be merged. Note that identifying_fields will only be stored to BigQuery, and only if the BigQuery action has been included.
    */
  var tableOptions: js.UndefOr[GooglePrivacyDlpV2TableOptions] = js.native
}
object GooglePrivacyDlpV2HybridFindingDetails {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridFindingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridFindingDetails]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridFindingDetailsMutableBuilder[Self <: GooglePrivacyDlpV2HybridFindingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerDetails(value: GooglePrivacyDlpV2Container): Self = StObject.set(x, "containerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerDetailsUndefined: Self = StObject.set(x, "containerDetails", js.undefined)
    
    @scala.inline
    def setFileOffset(value: String): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2HybridFindingDetails with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setRowOffset(value: String): Self = StObject.set(x, "rowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOffsetUndefined: Self = StObject.set(x, "rowOffset", js.undefined)
    
    @scala.inline
    def setTableOptions(value: GooglePrivacyDlpV2TableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
  }
}
