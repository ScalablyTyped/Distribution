package typings.maximMazurokGapiClientWebmasters

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebmasters.anon.Alt
import typings.maximMazurokGapiClientWebmasters.anon.Feedpath
import typings.maximMazurokGapiClientWebmasters.anon.Fields
import typings.maximMazurokGapiClientWebmasters.anon.Key
import typings.maximMazurokGapiClientWebmasters.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object webmasters {
      
      @js.native
      trait ApiDataRow extends StObject {
        
        var clicks: js.UndefOr[Double] = js.native
        
        var ctr: js.UndefOr[Double] = js.native
        
        var impressions: js.UndefOr[Double] = js.native
        
        var keys: js.UndefOr[js.Array[String]] = js.native
        
        var position: js.UndefOr[Double] = js.native
      }
      object ApiDataRow {
        
        @scala.inline
        def apply(): ApiDataRow = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApiDataRow]
        }
        
        @scala.inline
        implicit class ApiDataRowMutableBuilder[Self <: ApiDataRow] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
          
          @scala.inline
          def setCtr(value: Double): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCtrUndefined: Self = StObject.set(x, "ctr", js.undefined)
          
          @scala.inline
          def setImpressions(value: Double): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
          
          @scala.inline
          def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
          
          @scala.inline
          def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
          
          @scala.inline
          def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        }
      }
      
      @js.native
      trait ApiDimensionFilter extends StObject {
        
        var dimension: js.UndefOr[String] = js.native
        
        var expression: js.UndefOr[String] = js.native
        
        var operator: js.UndefOr[String] = js.native
      }
      object ApiDimensionFilter {
        
        @scala.inline
        def apply(): ApiDimensionFilter = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApiDimensionFilter]
        }
        
        @scala.inline
        implicit class ApiDimensionFilterMutableBuilder[Self <: ApiDimensionFilter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
          
          @scala.inline
          def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
          
          @scala.inline
          def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
        }
      }
      
      @js.native
      trait ApiDimensionFilterGroup extends StObject {
        
        var filters: js.UndefOr[js.Array[ApiDimensionFilter]] = js.native
        
        var groupType: js.UndefOr[String] = js.native
      }
      object ApiDimensionFilterGroup {
        
        @scala.inline
        def apply(): ApiDimensionFilterGroup = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApiDimensionFilterGroup]
        }
        
        @scala.inline
        implicit class ApiDimensionFilterGroupMutableBuilder[Self <: ApiDimensionFilterGroup] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFilters(value: js.Array[ApiDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
          
          @scala.inline
          def setFiltersVarargs(value: ApiDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
          
          @scala.inline
          def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
        }
      }
      
      @js.native
      trait SearchAnalyticsQueryRequest extends StObject {
        
        /**
          * [Optional; Default is "auto"] How data is aggregated. If aggregated by property, all data for the same property is aggregated; if aggregated by page, all data is aggregated by
          * canonical URI. If you filter or group by page, choose AUTO; otherwise you can aggregate either by property or by page, depending on how you want your data calculated; see  the help
          * documentation to learn how data is calculated differently by site versus by page.
          *
          * Note: If you group or filter by page, you cannot aggregate by property.
          *
          * If you specify any value other than AUTO, the aggregation type in the result will match the requested type, or if you request an invalid type, you will get an error. The API will
          * never change your aggregation type if the requested type is invalid.
          */
        var aggregationType: js.UndefOr[String] = js.native
        
        /**
          * [Optional] Zero or more filters to apply to the dimension grouping values; for example, 'query contains "buy"' to see only data where the query string contains the substring "buy"
          * (not case-sensitive). You can filter by a dimension without grouping by it.
          */
        var dimensionFilterGroups: js.UndefOr[js.Array[ApiDimensionFilterGroup]] = js.native
        
        /**
          * [Optional] Zero or more dimensions to group results by. Dimensions are the group-by values in the Search Analytics page. Dimensions are combined to create a unique row key for each
          * row. Results are grouped in the order that you supply these dimensions.
          */
        var dimensions: js.UndefOr[js.Array[String]] = js.native
        
        /** [Required] End date of the requested date range, in YYYY-MM-DD format, in PST (UTC - 8:00). Must be greater than or equal to the start date. This value is included in the range. */
        var endDate: js.UndefOr[String] = js.native
        
        /** [Optional; Default is 1000] The maximum number of rows to return. Must be a number from 1 to 5,000 (inclusive). */
        var rowLimit: js.UndefOr[Double] = js.native
        
        /** [Optional; Default is "web"] The search type to filter for. */
        var searchType: js.UndefOr[String] = js.native
        
        /** [Required] Start date of the requested date range, in YYYY-MM-DD format, in PST time (UTC - 8:00). Must be less than or equal to the end date. This value is included in the range. */
        var startDate: js.UndefOr[String] = js.native
        
        /** [Optional; Default is 0] Zero-based index of the first row in the response. Must be a non-negative number. */
        var startRow: js.UndefOr[Double] = js.native
      }
      object SearchAnalyticsQueryRequest {
        
        @scala.inline
        def apply(): SearchAnalyticsQueryRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SearchAnalyticsQueryRequest]
        }
        
        @scala.inline
        implicit class SearchAnalyticsQueryRequestMutableBuilder[Self <: SearchAnalyticsQueryRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAggregationType(value: String): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
          
          @scala.inline
          def setDimensionFilterGroups(value: js.Array[ApiDimensionFilterGroup]): Self = StObject.set(x, "dimensionFilterGroups", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimensionFilterGroupsUndefined: Self = StObject.set(x, "dimensionFilterGroups", js.undefined)
          
          @scala.inline
          def setDimensionFilterGroupsVarargs(value: ApiDimensionFilterGroup*): Self = StObject.set(x, "dimensionFilterGroups", js.Array(value :_*))
          
          @scala.inline
          def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
          
          @scala.inline
          def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
          
          @scala.inline
          def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
          
          @scala.inline
          def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowLimitUndefined: Self = StObject.set(x, "rowLimit", js.undefined)
          
          @scala.inline
          def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
          
          @scala.inline
          def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
          
          @scala.inline
          def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
        }
      }
      
      @js.native
      trait SearchAnalyticsQueryResponse extends StObject {
        
        /** How the results were aggregated. */
        var responseAggregationType: js.UndefOr[String] = js.native
        
        /** A list of rows grouped by the key values in the order given in the query. */
        var rows: js.UndefOr[js.Array[ApiDataRow]] = js.native
      }
      object SearchAnalyticsQueryResponse {
        
        @scala.inline
        def apply(): SearchAnalyticsQueryResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SearchAnalyticsQueryResponse]
        }
        
        @scala.inline
        implicit class SearchAnalyticsQueryResponseMutableBuilder[Self <: SearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setResponseAggregationType(value: String): Self = StObject.set(x, "responseAggregationType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResponseAggregationTypeUndefined: Self = StObject.set(x, "responseAggregationType", js.undefined)
          
          @scala.inline
          def setRows(value: js.Array[ApiDataRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
          
          @scala.inline
          def setRowsVarargs(value: ApiDataRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SearchanalyticsResource extends StObject {
        
        /**
          * Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date range of one or more days.
          *
          * When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a broad date range query grouped by
          * date for any metric, and see which day rows are returned.
          */
        def query(request: Alt): Request[SearchAnalyticsQueryResponse] = js.native
        def query(request: Fields, body: SearchAnalyticsQueryRequest): Request[SearchAnalyticsQueryResponse] = js.native
      }
      
      @js.native
      trait SitemapsListResponse extends StObject {
        
        /** Contains detailed information about a specific URL submitted as a sitemap. */
        var sitemap: js.UndefOr[js.Array[WmxSitemap]] = js.native
      }
      object SitemapsListResponse {
        
        @scala.inline
        def apply(): SitemapsListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SitemapsListResponse]
        }
        
        @scala.inline
        implicit class SitemapsListResponseMutableBuilder[Self <: SitemapsListResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSitemap(value: js.Array[WmxSitemap]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
          
          @scala.inline
          def setSitemapVarargs(value: WmxSitemap*): Self = StObject.set(x, "sitemap", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SitemapsResource extends StObject {
        
        /** Deletes a sitemap from this site. */
        def delete(): Request[Unit] = js.native
        def delete(request: Feedpath): Request[Unit] = js.native
        
        /** Retrieves information about a specific sitemap. */
        def get(): Request[WmxSitemap] = js.native
        def get(request: Feedpath): Request[WmxSitemap] = js.native
        
        /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
        def list(): Request[SitemapsListResponse] = js.native
        def list(request: Key): Request[SitemapsListResponse] = js.native
        
        /** Submits a sitemap for a site. */
        def submit(): Request[Unit] = js.native
        def submit(request: Feedpath): Request[Unit] = js.native
      }
      
      @js.native
      trait SitesListResponse extends StObject {
        
        /** Contains permission level information about a Search Console site. For more information, see Permissions in Search Console. */
        var siteEntry: js.UndefOr[js.Array[WmxSite]] = js.native
      }
      object SitesListResponse {
        
        @scala.inline
        def apply(): SitesListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SitesListResponse]
        }
        
        @scala.inline
        implicit class SitesListResponseMutableBuilder[Self <: SitesListResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSiteEntry(value: js.Array[WmxSite]): Self = StObject.set(x, "siteEntry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSiteEntryUndefined: Self = StObject.set(x, "siteEntry", js.undefined)
          
          @scala.inline
          def setSiteEntryVarargs(value: WmxSite*): Self = StObject.set(x, "siteEntry", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SitesResource extends StObject {
        
        /** Adds a site to the set of the user's sites in Search Console. */
        def add(): Request[Unit] = js.native
        def add(request: Fields): Request[Unit] = js.native
        
        /** Removes a site from the set of the user's Search Console sites. */
        def delete(): Request[Unit] = js.native
        def delete(request: Fields): Request[Unit] = js.native
        
        /** Retrieves information about specific site. */
        def get(): Request[WmxSite] = js.native
        def get(request: Fields): Request[WmxSite] = js.native
        
        /** Lists the user's Search Console sites. */
        def list(): Request[SitesListResponse] = js.native
        def list(request: Oauthtoken): Request[SitesListResponse] = js.native
      }
      
      @js.native
      trait WmxSite extends StObject {
        
        /** The user's permission level for the site. */
        var permissionLevel: js.UndefOr[String] = js.native
        
        /** The URL of the site. */
        var siteUrl: js.UndefOr[String] = js.native
      }
      object WmxSite {
        
        @scala.inline
        def apply(): WmxSite = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WmxSite]
        }
        
        @scala.inline
        implicit class WmxSiteMutableBuilder[Self <: WmxSite] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
          
          @scala.inline
          def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
        }
      }
      
      @js.native
      trait WmxSitemap extends StObject {
        
        /** The various content types in the sitemap. */
        var contents: js.UndefOr[js.Array[WmxSitemapContent]] = js.native
        
        /** Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed before it can be processed correctly. */
        var errors: js.UndefOr[String] = js.native
        
        /** If true, the sitemap has not been processed. */
        var isPending: js.UndefOr[Boolean] = js.native
        
        /** If true, the sitemap is a collection of sitemaps. */
        var isSitemapsIndex: js.UndefOr[Boolean] = js.native
        
        /** Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-mm-dd). */
        var lastDownloaded: js.UndefOr[String] = js.native
        
        /** Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-dd). */
        var lastSubmitted: js.UndefOr[String] = js.native
        
        /** The url of the sitemap. */
        var path: js.UndefOr[String] = js.native
        
        /** The type of the sitemap. For example: rssFeed. */
        var `type`: js.UndefOr[String] = js.native
        
        /** Number of warnings for the sitemap. These are generally non-critical issues with URLs in the sitemaps. */
        var warnings: js.UndefOr[String] = js.native
      }
      object WmxSitemap {
        
        @scala.inline
        def apply(): WmxSitemap = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WmxSitemap]
        }
        
        @scala.inline
        implicit class WmxSitemapMutableBuilder[Self <: WmxSitemap] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContents(value: js.Array[WmxSitemapContent]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
          
          @scala.inline
          def setContentsVarargs(value: WmxSitemapContent*): Self = StObject.set(x, "contents", js.Array(value :_*))
          
          @scala.inline
          def setErrors(value: String): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
          
          @scala.inline
          def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsPendingUndefined: Self = StObject.set(x, "isPending", js.undefined)
          
          @scala.inline
          def setIsSitemapsIndex(value: Boolean): Self = StObject.set(x, "isSitemapsIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsSitemapsIndexUndefined: Self = StObject.set(x, "isSitemapsIndex", js.undefined)
          
          @scala.inline
          def setLastDownloaded(value: String): Self = StObject.set(x, "lastDownloaded", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLastDownloadedUndefined: Self = StObject.set(x, "lastDownloaded", js.undefined)
          
          @scala.inline
          def setLastSubmitted(value: String): Self = StObject.set(x, "lastSubmitted", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLastSubmittedUndefined: Self = StObject.set(x, "lastSubmitted", js.undefined)
          
          @scala.inline
          def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          @scala.inline
          def setWarnings(value: String): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
        }
      }
      
      @js.native
      trait WmxSitemapContent extends StObject {
        
        /** The number of URLs from the sitemap that were indexed (of the content type). */
        var indexed: js.UndefOr[String] = js.native
        
        /** The number of URLs in the sitemap (of the content type). */
        var submitted: js.UndefOr[String] = js.native
        
        /** The specific type of content in this sitemap. For example: web. */
        var `type`: js.UndefOr[String] = js.native
      }
      object WmxSitemapContent {
        
        @scala.inline
        def apply(): WmxSitemapContent = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WmxSitemapContent]
        }
        
        @scala.inline
        implicit class WmxSitemapContentMutableBuilder[Self <: WmxSitemapContent] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIndexed(value: String): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
          
          @scala.inline
          def setSubmitted(value: String): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubmittedUndefined: Self = StObject.set(x, "submitted", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
    }
  }
}
