package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
  /**
    * Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of
    * the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations,
    * it is suggested to split it into multiple jobs with unique requisition_ids (e.g. 'ReqA' becomes 'ReqA-1', 'ReqA-2', etc.) as multiple jobs with the same company_name, language_code
    * and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that
    * close to each other in the same job for better search experience. The maximum number of allowed characters is 500.
    */
  var addresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. At least one field within ApplicationInfo must be specified. Job application information. */
  var applicationInfo: js.UndefOr[ApplicationInfo] = js.native
  
  /** Output only. Display name of the company listing the job. */
  var companyDisplayName: js.UndefOr[String] = js.native
  
  /** Required. The resource name of the company listing the job, such as "projects/api-test-project/companies/foo". */
  var companyName: js.UndefOr[String] = js.native
  
  /** Optional. Job compensation information. */
  var compensationInfo: js.UndefOr[CompensationInfo] = js.native
  
  /**
    * Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up
    * to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable
    * `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of
    * `string_values` across all keys is 50KB.
    */
  var customAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.CustomAttribute}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.Job with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The desired education degrees for the job, such as Bachelors, Masters. */
  var degreeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255. */
  var department: js.UndefOr[String] = js.native
  
  /** Output only. Derived details about the job posting. */
  var derivedInfo: js.UndefOr[JobDerivedInfo] = js.native
  
  /**
    * Required. The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object
    * for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
    */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. The employment type(s) of a job, for example, full time or part time. */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is
    * 10,000.
    */
  var incentives: js.UndefOr[String] = js.native
  
  /** Optional. The benefits included with the job. */
  var jobBenefits: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored. */
  var jobEndTime: js.UndefOr[String] = js.native
  
  /** Optional. The experience level associated with the job, such as "Entry Level". */
  var jobLevel: js.UndefOr[String] = js.native
  
  /** Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored. */
  var jobStartTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as
    * "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class="external" target="_blank" }. If this field is
    * unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to 'en_US'.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is "projects/{project_id}/jobs/{job_id}", for example,
    * "projects/api-test-project/jobs/1234". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp when this job posting was created. */
  var postingCreateTime: js.UndefOr[String] = js.native
  
  /**
    * Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears
    * in search results. The expired job can't be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An
    * expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name,
    * language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs
    * count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are
    * ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is
    * not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job's creation time. For example, if the job was created on 2017/01/01 13:00AM
    * UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by
    * UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the
    * job's last update time. Otherwise the expiration date isn't updated.
    */
  var postingExpireTime: js.UndefOr[String] = js.native
  
  /** Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored. */
  var postingPublishTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region
    * finds this job posting if an exact location match isn't specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to
    * the same location level as this field is strongly recommended.
    */
  var postingRegion: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp when this job posting was last updated. */
  var postingUpdateTime: js.UndefOr[String] = js.native
  
  /** Optional. Options for job processing. */
  var processingOptions: js.UndefOr[ProcessingOptions] = js.native
  
  /**
    * Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search
    * call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue >0 are returned in a FEATURED_JOB_SEARCH.
    * Default value is 0, and negative values are treated as 0.
    */
  var promotionValue: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This
    * field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
    */
  var qualifications: js.UndefOr[String] = js.native
  
  /**
    * Required. The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification
    * and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed
    * characters is 255.
    */
  var requisitionId: js.UndefOr[String] = js.native
  
  /**
    * Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes
    * HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
    */
  var responsibilities: js.UndefOr[String] = js.native
  
  /** Required. The title of the job, such as "Software Engineer" The maximum number of allowed characters is 500. */
  var title: js.UndefOr[String] = js.native
  
  /** Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified. */
  var visibility: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setApplicationInfo(value: ApplicationInfo): Self = StObject.set(x, "applicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInfoUndefined: Self = StObject.set(x, "applicationInfo", js.undefined)
    
    @scala.inline
    def setCompanyDisplayName(value: String): Self = StObject.set(x, "companyDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyDisplayNameUndefined: Self = StObject.set(x, "companyDisplayName", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setCompensationInfo(value: CompensationInfo): Self = StObject.set(x, "compensationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationInfoUndefined: Self = StObject.set(x, "compensationInfo", js.undefined)
    
    @scala.inline
    def setCustomAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.CustomAttribute}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.Job with TopLevel[js.Any]
    ): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setDegreeTypes(value: js.Array[String]): Self = StObject.set(x, "degreeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreeTypesUndefined: Self = StObject.set(x, "degreeTypes", js.undefined)
    
    @scala.inline
    def setDegreeTypesVarargs(value: String*): Self = StObject.set(x, "degreeTypes", js.Array(value :_*))
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDerivedInfo(value: JobDerivedInfo): Self = StObject.set(x, "derivedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivedInfoUndefined: Self = StObject.set(x, "derivedInfo", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEmploymentTypes(value: js.Array[String]): Self = StObject.set(x, "employmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmploymentTypesUndefined: Self = StObject.set(x, "employmentTypes", js.undefined)
    
    @scala.inline
    def setEmploymentTypesVarargs(value: String*): Self = StObject.set(x, "employmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setIncentives(value: String): Self = StObject.set(x, "incentives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncentivesUndefined: Self = StObject.set(x, "incentives", js.undefined)
    
    @scala.inline
    def setJobBenefits(value: js.Array[String]): Self = StObject.set(x, "jobBenefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBenefitsUndefined: Self = StObject.set(x, "jobBenefits", js.undefined)
    
    @scala.inline
    def setJobBenefitsVarargs(value: String*): Self = StObject.set(x, "jobBenefits", js.Array(value :_*))
    
    @scala.inline
    def setJobEndTime(value: String): Self = StObject.set(x, "jobEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobEndTimeUndefined: Self = StObject.set(x, "jobEndTime", js.undefined)
    
    @scala.inline
    def setJobLevel(value: String): Self = StObject.set(x, "jobLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLevelUndefined: Self = StObject.set(x, "jobLevel", js.undefined)
    
    @scala.inline
    def setJobStartTime(value: String): Self = StObject.set(x, "jobStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStartTimeUndefined: Self = StObject.set(x, "jobStartTime", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPostingCreateTime(value: String): Self = StObject.set(x, "postingCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostingCreateTimeUndefined: Self = StObject.set(x, "postingCreateTime", js.undefined)
    
    @scala.inline
    def setPostingExpireTime(value: String): Self = StObject.set(x, "postingExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostingExpireTimeUndefined: Self = StObject.set(x, "postingExpireTime", js.undefined)
    
    @scala.inline
    def setPostingPublishTime(value: String): Self = StObject.set(x, "postingPublishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostingPublishTimeUndefined: Self = StObject.set(x, "postingPublishTime", js.undefined)
    
    @scala.inline
    def setPostingRegion(value: String): Self = StObject.set(x, "postingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostingRegionUndefined: Self = StObject.set(x, "postingRegion", js.undefined)
    
    @scala.inline
    def setPostingUpdateTime(value: String): Self = StObject.set(x, "postingUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostingUpdateTimeUndefined: Self = StObject.set(x, "postingUpdateTime", js.undefined)
    
    @scala.inline
    def setProcessingOptions(value: ProcessingOptions): Self = StObject.set(x, "processingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOptionsUndefined: Self = StObject.set(x, "processingOptions", js.undefined)
    
    @scala.inline
    def setPromotionValue(value: Double): Self = StObject.set(x, "promotionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionValueUndefined: Self = StObject.set(x, "promotionValue", js.undefined)
    
    @scala.inline
    def setQualifications(value: String): Self = StObject.set(x, "qualifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationsUndefined: Self = StObject.set(x, "qualifications", js.undefined)
    
    @scala.inline
    def setRequisitionId(value: String): Self = StObject.set(x, "requisitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequisitionIdUndefined: Self = StObject.set(x, "requisitionId", js.undefined)
    
    @scala.inline
    def setResponsibilities(value: String): Self = StObject.set(x, "responsibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibilitiesUndefined: Self = StObject.set(x, "responsibilities", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
