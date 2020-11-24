package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchJobsResponse extends js.Object {
  
  /**
    * If query broadening is enabled, we may append additional results from the broadened query. This number indicates how many of the jobs returned in the jobs field are from the
    * broadened query. These results are always at the end of the jobs list. In particular, a value of 0, or if the field isn't set, all the jobs in the jobs list are from the original
    * (without broadening) query. If this field is non-zero, subsequent requests with offset after this result set should contain all broadened results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.native
  
  /** An estimation of the number of jobs that match the specified query. This number is not guaranteed to be accurate. For accurate results, see SearchJobsResponse.total_size. */
  var estimatedTotalSize: js.UndefOr[Double] = js.native
  
  /** The histogram results that match specified SearchJobsRequest.histogram_facets. */
  var histogramResults: js.UndefOr[HistogramResults] = js.native
  
  /**
    * The location filters that the service applied to the specified query. If any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[Location]] = js.native
  
  /** The Job entities that match the specified SearchJobsRequest. */
  var matchingJobs: js.UndefOr[js.Array[MatchingJob]] = js.native
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.native
  
  /** The token that specifies the starting position of the next page of results. This field is empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The spell checking result, and correction. */
  var spellCorrection: js.UndefOr[SpellingCorrection] = js.native
  
  /** The precise result count with limit 100,000. */
  var totalSize: js.UndefOr[Double] = js.native
}
object SearchJobsResponse {
  
  @scala.inline
  def apply(): SearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchJobsResponse]
  }
  
  @scala.inline
  implicit class SearchJobsResponseOps[Self <: SearchJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setBroadenedQueryJobsCount(value: Double): Self = this.set("broadenedQueryJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadenedQueryJobsCount: Self = this.set("broadenedQueryJobsCount", js.undefined)
    
    @scala.inline
    def setEstimatedTotalSize(value: Double): Self = this.set("estimatedTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedTotalSize: Self = this.set("estimatedTotalSize", js.undefined)
    
    @scala.inline
    def setHistogramResults(value: HistogramResults): Self = this.set("histogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramResults: Self = this.set("histogramResults", js.undefined)
    
    @scala.inline
    def setLocationFiltersVarargs(value: Location*): Self = this.set("locationFilters", js.Array(value :_*))
    
    @scala.inline
    def setLocationFilters(value: js.Array[Location]): Self = this.set("locationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationFilters: Self = this.set("locationFilters", js.undefined)
    
    @scala.inline
    def setMatchingJobsVarargs(value: MatchingJob*): Self = this.set("matchingJobs", js.Array(value :_*))
    
    @scala.inline
    def setMatchingJobs(value: js.Array[MatchingJob]): Self = this.set("matchingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingJobs: Self = this.set("matchingJobs", js.undefined)
    
    @scala.inline
    def setMetadata(value: ResponseMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSpellCorrection(value: SpellingCorrection): Self = this.set("spellCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCorrection: Self = this.set("spellCorrection", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
