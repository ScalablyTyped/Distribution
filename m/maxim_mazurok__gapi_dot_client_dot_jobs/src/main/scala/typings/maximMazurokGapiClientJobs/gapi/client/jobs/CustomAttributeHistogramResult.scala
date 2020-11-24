package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAttributeHistogramResult extends js.Object {
  
  /** Stores the key of custom attribute the histogram is performed on. */
  var key: js.UndefOr[String] = js.native
  
  /** Stores bucketed histogram counting result or min/max values for custom attribute long values associated with `key`. */
  var longValueHistogramResult: js.UndefOr[NumericBucketingResult] = js.native
  
  /** Stores a map from the values of string custom field associated with `key` to the number of jobs with that value in this histogram result. */
  var stringValueHistogramResult: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.CustomAttributeHistogramResult with TopLevel[js.Any]
  ] = js.native
}
object CustomAttributeHistogramResult {
  
  @scala.inline
  def apply(): CustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeHistogramResult]
  }
  
  @scala.inline
  implicit class CustomAttributeHistogramResultOps[Self <: CustomAttributeHistogramResult] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramResult(value: NumericBucketingResult): Self = this.set("longValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValueHistogramResult: Self = this.set("longValueHistogramResult", js.undefined)
    
    @scala.inline
    def setStringValueHistogramResult(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.CustomAttributeHistogramResult with TopLevel[js.Any]
    ): Self = this.set("stringValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValueHistogramResult: Self = this.set("stringValueHistogramResult", js.undefined)
  }
}
