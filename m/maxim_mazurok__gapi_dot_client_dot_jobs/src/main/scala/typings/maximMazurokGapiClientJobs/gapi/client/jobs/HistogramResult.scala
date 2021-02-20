package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramResult extends StObject {
  
  /** The Histogram search filters. */
  var searchType: js.UndefOr[String] = js.native
  
  /**
    * A map from the values of field to the number of jobs with that value in this search result. Key: search type (filter names, such as the companyName). Values: the count of jobs that
    * match the filter for this search.
    */
  var values: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramResult with TopLevel[js.Any]
  ] = js.native
}
object HistogramResult {
  
  @scala.inline
  def apply(): HistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramResult]
  }
  
  @scala.inline
  implicit class HistogramResultMutableBuilder[Self <: HistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    @scala.inline
    def setValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramResult with TopLevel[js.Any]
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
