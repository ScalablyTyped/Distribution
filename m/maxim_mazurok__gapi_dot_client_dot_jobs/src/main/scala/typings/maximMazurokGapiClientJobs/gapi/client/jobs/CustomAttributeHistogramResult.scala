package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAttributeHistogramResult extends StObject {
  
  /** Stores the key of custom attribute the histogram is performed on. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Stores bucketed histogram counting result or min/max values for custom attribute long values associated with `key`. */
  var longValueHistogramResult: js.UndefOr[NumericBucketingResult] = js.undefined
  
  /** Stores a map from the values of string custom field associated with `key` to the number of jobs with that value in this histogram result. */
  var stringValueHistogramResult: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.CustomAttributeHistogramResult & TopLevel[js.Any]
  ] = js.undefined
}
object CustomAttributeHistogramResult {
  
  @scala.inline
  def apply(): CustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeHistogramResult]
  }
  
  @scala.inline
  implicit class CustomAttributeHistogramResultMutableBuilder[Self <: CustomAttributeHistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramResult(value: NumericBucketingResult): Self = StObject.set(x, "longValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueHistogramResultUndefined: Self = StObject.set(x, "longValueHistogramResult", js.undefined)
    
    @scala.inline
    def setStringValueHistogramResult(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.CustomAttributeHistogramResult & TopLevel[js.Any]
    ): Self = StObject.set(x, "stringValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueHistogramResultUndefined: Self = StObject.set(x, "stringValueHistogramResult", js.undefined)
  }
}
