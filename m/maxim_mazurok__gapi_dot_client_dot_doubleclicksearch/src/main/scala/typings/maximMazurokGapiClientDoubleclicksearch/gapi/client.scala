package typings.maximMazurokGapiClientDoubleclicksearch.gapi

import org.scalablytyped.runtime.StringDictionary
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Accesstoken
import typings.maximMazurokGapiClientDoubleclicksearch.anon.AdGroupId
import typings.maximMazurokGapiClientDoubleclicksearch.anon.AdvertiserId
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Alt
import typings.maximMazurokGapiClientDoubleclicksearch.anon.ByteCount
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Callback
import typings.maximMazurokGapiClientDoubleclicksearch.anon.ChangedAttributesSinceTimestamp
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Column
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Fields
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Key
import typings.maximMazurokGapiClientDoubleclicksearch.anon.Oauthtoken
import typings.maximMazurokGapiClientDoubleclicksearch.anon.PrettyPrint
import typings.maximMazurokGapiClientDoubleclicksearch.anon.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  object doubleclicksearch {
    
    @js.native
    trait Availability extends StObject {
      
      /** DS advertiser ID. */
      var advertiserId: js.UndefOr[String] = js.native
      
      /** DS agency ID. */
      var agencyId: js.UndefOr[String] = js.native
      
      /** The time by which all conversions have been uploaded, in epoch millis UTC. */
      var availabilityTimestamp: js.UndefOr[String] = js.native
      
      /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
      var segmentationId: js.UndefOr[String] = js.native
      
      /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
      var segmentationName: js.UndefOr[String] = js.native
      
      /** The segmentation type that this availability is for (its default value is `FLOODLIGHT`). */
      var segmentationType: js.UndefOr[String] = js.native
    }
    object Availability {
      
      @scala.inline
      def apply(): Availability = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Availability]
      }
      
      @scala.inline
      implicit class AvailabilityMutableBuilder[Self <: Availability] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
        
        @scala.inline
        def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
        
        @scala.inline
        def setAvailabilityTimestamp(value: String): Self = StObject.set(x, "availabilityTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAvailabilityTimestampUndefined: Self = StObject.set(x, "availabilityTimestamp", js.undefined)
        
        @scala.inline
        def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
        
        @scala.inline
        def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
        
        @scala.inline
        def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
      }
    }
    
    @js.native
    trait Conversion extends StObject {
      
      /** DS ad group ID. */
      var adGroupId: js.UndefOr[String] = js.native
      
      /** DS ad ID. */
      var adId: js.UndefOr[String] = js.native
      
      /** DS advertiser ID. */
      var advertiserId: js.UndefOr[String] = js.native
      
      /** DS agency ID. */
      var agencyId: js.UndefOr[String] = js.native
      
      /** Available to advertisers only after contacting DoubleClick Search customer support. */
      var attributionModel: js.UndefOr[String] = js.native
      
      /** DS campaign ID. */
      var campaignId: js.UndefOr[String] = js.native
      
      /** Sales channel for the product. Acceptable values are: - "`local`": a physical store - "`online`": an online store */
      var channel: js.UndefOr[String] = js.native
      
      /** DS click ID for the conversion. */
      var clickId: js.UndefOr[String] = js.native
      
      /**
        * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is meaningful to them. Each conversion in a request must specify a unique ID, and the
        * combination of ID and timestamp must be unique amongst all conversions within the advertiser. For online conversions, DS copies the `dsConversionId` or `floodlightOrderId` into this
        * property depending on the advertiser's Floodlight instructions.
        */
      var conversionId: js.UndefOr[String] = js.native
      
      /** The time at which the conversion was last modified, in epoch millis UTC. */
      var conversionModifiedTimestamp: js.UndefOr[String] = js.native
      
      /** The time at which the conversion took place, in epoch millis UTC. */
      var conversionTimestamp: js.UndefOr[String] = js.native
      
      /** Available to advertisers only after contacting DoubleClick Search customer support. */
      var countMillis: js.UndefOr[String] = js.native
      
      /** DS criterion (keyword) ID. */
      var criterionId: js.UndefOr[String] = js.native
      
      /** The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char) format. */
      var currencyCode: js.UndefOr[String] = js.native
      
      /** Custom dimensions for the conversion, which can be used to filter data in a report. */
      var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.native
      
      /** Custom metrics for the conversion. */
      var customMetric: js.UndefOr[js.Array[CustomMetric]] = js.native
      
      /** The type of device on which the conversion occurred. */
      var deviceType: js.UndefOr[String] = js.native
      
      /** ID that DoubleClick Search generates for each conversion. */
      var dsConversionId: js.UndefOr[String] = js.native
      
      /** DS engine account ID. */
      var engineAccountId: js.UndefOr[String] = js.native
      
      /** The Floodlight order ID provided by the advertiser for the conversion. */
      var floodlightOrderId: js.UndefOr[String] = js.native
      
      /** ID that DS generates and uses to uniquely identify the inventory account that contains the product. */
      var inventoryAccountId: js.UndefOr[String] = js.native
      
      /** The country registered for the Merchant Center feed that contains the product. Use an ISO 3166 code to specify a country. */
      var productCountry: js.UndefOr[String] = js.native
      
      /** DS product group ID. */
      var productGroupId: js.UndefOr[String] = js.native
      
      /** The product ID (SKU). */
      var productId: js.UndefOr[String] = js.native
      
      /** The language registered for the Merchant Center feed that contains the product. Use an ISO 639 code to specify a language. */
      var productLanguage: js.UndefOr[String] = js.native
      
      /** The quantity of this conversion, in millis. */
      var quantityMillis: js.UndefOr[String] = js.native
      
      /**
        * The revenue amount of this `TRANSACTION` conversion, in micros (value multiplied by 1000000, no decimal). For example, to specify a revenue value of "10" enter "10000000" (10
        * million) in your request.
        */
      var revenueMicros: js.UndefOr[String] = js.native
      
      /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
      var segmentationId: js.UndefOr[String] = js.native
      
      /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
      var segmentationName: js.UndefOr[String] = js.native
      
      /** The segmentation type of this conversion (for example, `FLOODLIGHT`). */
      var segmentationType: js.UndefOr[String] = js.native
      
      /** The state of the conversion, that is, either `ACTIVE` or `REMOVED`. Note: state DELETED is deprecated. */
      var state: js.UndefOr[String] = js.native
      
      /** The ID of the local store for which the product was advertised. Applicable only when the channel is "`local`". */
      var storeId: js.UndefOr[String] = js.native
      
      /**
        * The type of the conversion, that is, either `ACTION` or `TRANSACTION`. An `ACTION` conversion is an action by the user that has no monetarily quantifiable value, while a
        * `TRANSACTION` conversion is an action that does have a monetarily quantifiable value. Examples are email list signups (`ACTION`) versus ecommerce purchases (`TRANSACTION`).
        */
      var `type`: js.UndefOr[String] = js.native
    }
    object Conversion {
      
      @scala.inline
      def apply(): Conversion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Conversion]
      }
      
      @scala.inline
      implicit class ConversionMutableBuilder[Self <: Conversion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
        
        @scala.inline
        def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
        
        @scala.inline
        def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
        
        @scala.inline
        def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
        
        @scala.inline
        def setAttributionModel(value: String): Self = StObject.set(x, "attributionModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributionModelUndefined: Self = StObject.set(x, "attributionModel", js.undefined)
        
        @scala.inline
        def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
        
        @scala.inline
        def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
        
        @scala.inline
        def setClickId(value: String): Self = StObject.set(x, "clickId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClickIdUndefined: Self = StObject.set(x, "clickId", js.undefined)
        
        @scala.inline
        def setConversionId(value: String): Self = StObject.set(x, "conversionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConversionIdUndefined: Self = StObject.set(x, "conversionId", js.undefined)
        
        @scala.inline
        def setConversionModifiedTimestamp(value: String): Self = StObject.set(x, "conversionModifiedTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConversionModifiedTimestampUndefined: Self = StObject.set(x, "conversionModifiedTimestamp", js.undefined)
        
        @scala.inline
        def setConversionTimestamp(value: String): Self = StObject.set(x, "conversionTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConversionTimestampUndefined: Self = StObject.set(x, "conversionTimestamp", js.undefined)
        
        @scala.inline
        def setCountMillis(value: String): Self = StObject.set(x, "countMillis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountMillisUndefined: Self = StObject.set(x, "countMillis", js.undefined)
        
        @scala.inline
        def setCriterionId(value: String): Self = StObject.set(x, "criterionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCriterionIdUndefined: Self = StObject.set(x, "criterionId", js.undefined)
        
        @scala.inline
        def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
        
        @scala.inline
        def setCustomDimension(value: js.Array[CustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
        
        @scala.inline
        def setCustomDimensionVarargs(value: CustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value :_*))
        
        @scala.inline
        def setCustomMetric(value: js.Array[CustomMetric]): Self = StObject.set(x, "customMetric", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomMetricUndefined: Self = StObject.set(x, "customMetric", js.undefined)
        
        @scala.inline
        def setCustomMetricVarargs(value: CustomMetric*): Self = StObject.set(x, "customMetric", js.Array(value :_*))
        
        @scala.inline
        def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
        
        @scala.inline
        def setDsConversionId(value: String): Self = StObject.set(x, "dsConversionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDsConversionIdUndefined: Self = StObject.set(x, "dsConversionId", js.undefined)
        
        @scala.inline
        def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
        
        @scala.inline
        def setFloodlightOrderId(value: String): Self = StObject.set(x, "floodlightOrderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloodlightOrderIdUndefined: Self = StObject.set(x, "floodlightOrderId", js.undefined)
        
        @scala.inline
        def setInventoryAccountId(value: String): Self = StObject.set(x, "inventoryAccountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInventoryAccountIdUndefined: Self = StObject.set(x, "inventoryAccountId", js.undefined)
        
        @scala.inline
        def setProductCountry(value: String): Self = StObject.set(x, "productCountry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductCountryUndefined: Self = StObject.set(x, "productCountry", js.undefined)
        
        @scala.inline
        def setProductGroupId(value: String): Self = StObject.set(x, "productGroupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductGroupIdUndefined: Self = StObject.set(x, "productGroupId", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setProductLanguage(value: String): Self = StObject.set(x, "productLanguage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductLanguageUndefined: Self = StObject.set(x, "productLanguage", js.undefined)
        
        @scala.inline
        def setQuantityMillis(value: String): Self = StObject.set(x, "quantityMillis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuantityMillisUndefined: Self = StObject.set(x, "quantityMillis", js.undefined)
        
        @scala.inline
        def setRevenueMicros(value: String): Self = StObject.set(x, "revenueMicros", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevenueMicrosUndefined: Self = StObject.set(x, "revenueMicros", js.undefined)
        
        @scala.inline
        def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
        
        @scala.inline
        def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
        
        @scala.inline
        def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        @scala.inline
        def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait ConversionList extends StObject {
      
      /** The conversions being requested. */
      var conversion: js.UndefOr[js.Array[Conversion]] = js.native
      
      /** Identifies this as a ConversionList resource. Value: the fixed string doubleclicksearch#conversionList. */
      var kind: js.UndefOr[String] = js.native
    }
    object ConversionList {
      
      @scala.inline
      def apply(): ConversionList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConversionList]
      }
      
      @scala.inline
      implicit class ConversionListMutableBuilder[Self <: ConversionList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConversion(value: js.Array[Conversion]): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
        
        @scala.inline
        def setConversionVarargs(value: Conversion*): Self = StObject.set(x, "conversion", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait ConversionResource extends StObject {
      
      /** Retrieves a list of conversions from a DoubleClick Search engine account. */
      def get(): Request[ConversionList] = js.native
      def get(request: Accesstoken): Request[ConversionList] = js.native
      
      /** Inserts a batch of new conversions into DoubleClick Search. */
      def insert(request: Alt): Request[ConversionList] = js.native
      def insert(request: Callback, body: ConversionList): Request[ConversionList] = js.native
      
      /** Updates a batch of conversions in DoubleClick Search. */
      def update(request: Alt): Request[ConversionList] = js.native
      def update(request: Callback, body: ConversionList): Request[ConversionList] = js.native
      
      def updateAvailability(request: Callback, body: UpdateAvailabilityRequest): Request[UpdateAvailabilityResponse] = js.native
      /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
      def updateAvailability(request: Fields): Request[UpdateAvailabilityResponse] = js.native
    }
    
    @js.native
    trait CustomDimension extends StObject {
      
      /** Custom dimension name. */
      var name: js.UndefOr[String] = js.native
      
      /** Custom dimension value. */
      var value: js.UndefOr[String] = js.native
    }
    object CustomDimension {
      
      @scala.inline
      def apply(): CustomDimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomDimension]
      }
      
      @scala.inline
      implicit class CustomDimensionMutableBuilder[Self <: CustomDimension] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait CustomMetric extends StObject {
      
      /** Custom metric name. */
      var name: js.UndefOr[String] = js.native
      
      /** Custom metric numeric value. */
      var value: js.UndefOr[Double] = js.native
    }
    object CustomMetric {
      
      @scala.inline
      def apply(): CustomMetric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomMetric]
      }
      
      @scala.inline
      implicit class CustomMetricMutableBuilder[Self <: CustomMetric] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Report extends StObject {
      
      /** Asynchronous report only. Contains a list of generated report files once the report has successfully completed. */
      var files: js.UndefOr[js.Array[ByteCount]] = js.native
      
      /** Asynchronous report only. Id of the report. */
      var id: js.UndefOr[String] = js.native
      
      /** Asynchronous report only. True if and only if the report has completed successfully and the report files are ready to be downloaded. */
      var isReportReady: js.UndefOr[Boolean] = js.native
      
      /** Identifies this as a Report resource. Value: the fixed string `doubleclicksearch#report`. */
      var kind: js.UndefOr[String] = js.native
      
      /** The request that created the report. Optional fields not specified in the original request are filled with default values. */
      var request: js.UndefOr[ReportRequest] = js.native
      
      /** The number of report rows generated by the report, not including headers. */
      var rowCount: js.UndefOr[Double] = js.native
      
      /** Synchronous report only. Generated report rows. */
      var rows: js.UndefOr[js.Array[ReportRow]] = js.native
      
      /**
        * The currency code of all monetary values produced in the report, including values that are set by users (e.g., keyword bid settings) and metrics (e.g., cost and revenue). The
        * currency code of a report is determined by the `statisticsCurrency` field of the report request.
        */
      var statisticsCurrencyCode: js.UndefOr[String] = js.native
      
      /** If all statistics of the report are sourced from the same time zone, this would be it. Otherwise the field is unset. */
      var statisticsTimeZone: js.UndefOr[String] = js.native
    }
    object Report {
      
      @scala.inline
      def apply(): Report = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Report]
      }
      
      @scala.inline
      implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFiles(value: js.Array[ByteCount]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        @scala.inline
        def setFilesVarargs(value: ByteCount*): Self = StObject.set(x, "files", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIsReportReady(value: Boolean): Self = StObject.set(x, "isReportReady", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReportReadyUndefined: Self = StObject.set(x, "isReportReady", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setRequest(value: ReportRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[ReportRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: ReportRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setStatisticsCurrencyCode(value: String): Self = StObject.set(x, "statisticsCurrencyCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatisticsCurrencyCodeUndefined: Self = StObject.set(x, "statisticsCurrencyCode", js.undefined)
        
        @scala.inline
        def setStatisticsTimeZone(value: String): Self = StObject.set(x, "statisticsTimeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatisticsTimeZoneUndefined: Self = StObject.set(x, "statisticsTimeZone", js.undefined)
      }
    }
    
    @js.native
    trait ReportApiColumnSpec extends StObject {
      
      /** Name of a DoubleClick Search column to include in the report. */
      var columnName: js.UndefOr[String] = js.native
      
      /**
        * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower, and the custom dimension must already be set up in DoubleClick Search. The custom
        * dimension name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report, returns the value of the specified custom dimension for the given
        * conversion, if set. This column does not segment the conversion report.
        */
      var customDimensionName: js.UndefOr[String] = js.native
      
      /**
        * Name of a custom metric to include in the report. The report must be scoped to an advertiser or lower, and the custom metric must already be set up in DoubleClick Search. The custom
        * metric name, which appears in DoubleClick Search, is case sensitive.
        */
      var customMetricName: js.UndefOr[String] = js.native
      
      /** Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `startDate`. */
      var endDate: js.UndefOr[String] = js.native
      
      /** Synchronous report only. Set to `true` to group by this column. Defaults to `false`. */
      var groupByColumn: js.UndefOr[Boolean] = js.native
      
      /**
        * Text used to identify this column in the report output; defaults to `columnName` or `savedColumnName` when not specified. This can be used to prevent collisions between DoubleClick
        * Search columns and saved columns with the same name.
        */
      var headerText: js.UndefOr[String] = js.native
      
      /** The platform that is used to provide data for the custom dimension. Acceptable values are "floodlight". */
      var platformSource: js.UndefOr[String] = js.native
      
      /**
        * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`": returns metrics only for products that were sold - "`advertised`": returns metrics
        * only for products that were advertised in a Shopping campaign, and that might or might not have been sold
        */
      var productReportPerspective: js.UndefOr[String] = js.native
      
      /** Name of a saved column to include in the report. The report must be scoped at advertiser or lower, and this saved column must already be created in the DoubleClick Search UI. */
      var savedColumnName: js.UndefOr[String] = js.native
      
      /** Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `endDate`. */
      var startDate: js.UndefOr[String] = js.native
    }
    object ReportApiColumnSpec {
      
      @scala.inline
      def apply(): ReportApiColumnSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportApiColumnSpec]
      }
      
      @scala.inline
      implicit class ReportApiColumnSpecMutableBuilder[Self <: ReportApiColumnSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
        
        @scala.inline
        def setCustomDimensionName(value: String): Self = StObject.set(x, "customDimensionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomDimensionNameUndefined: Self = StObject.set(x, "customDimensionName", js.undefined)
        
        @scala.inline
        def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomMetricNameUndefined: Self = StObject.set(x, "customMetricName", js.undefined)
        
        @scala.inline
        def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        @scala.inline
        def setGroupByColumn(value: Boolean): Self = StObject.set(x, "groupByColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupByColumnUndefined: Self = StObject.set(x, "groupByColumn", js.undefined)
        
        @scala.inline
        def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
        
        @scala.inline
        def setPlatformSource(value: String): Self = StObject.set(x, "platformSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatformSourceUndefined: Self = StObject.set(x, "platformSource", js.undefined)
        
        @scala.inline
        def setProductReportPerspective(value: String): Self = StObject.set(x, "productReportPerspective", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductReportPerspectiveUndefined: Self = StObject.set(x, "productReportPerspective", js.undefined)
        
        @scala.inline
        def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
        
        @scala.inline
        def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      }
    }
    
    @js.native
    trait ReportRequest extends StObject {
      
      /**
        * The columns to include in the report. This includes both DoubleClick Search columns and saved columns. For DoubleClick Search columns, only the `columnName` parameter is required.
        * For saved columns only the `savedColumnName` parameter is required. Both `columnName` and `savedColumnName` cannot be set in the same stanza.\ The maximum number of columns per
        * request is 300.
        */
      var columns: js.UndefOr[js.Array[ReportApiColumnSpec]] = js.native
      
      /** Format that the report should be returned in. Currently `csv` or `tsv` is supported. */
      var downloadFormat: js.UndefOr[String] = js.native
      
      /** A list of filters to be applied to the report.\ The maximum number of filters per request is 300. */
      var filters: js.UndefOr[js.Array[Column]] = js.native
      
      /** Determines if removed entities should be included in the report. Defaults to `false`. Deprecated, please use `includeRemovedEntities` instead. */
      var includeDeletedEntities: js.UndefOr[Boolean] = js.native
      
      /** Determines if removed entities should be included in the report. Defaults to `false`. */
      var includeRemovedEntities: js.UndefOr[Boolean] = js.native
      
      /**
        * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values are `1000000` to `100000000`,
        * inclusive.
        */
      var maxRowsPerFile: js.UndefOr[Double] = js.native
      
      /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows.\ The maximum number of orderings per request is 300. */
      var orderBy: js.UndefOr[js.Array[SortOrder]] = js.native
      
      /**
        * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the lowest scoped level desired up
        * through agency is required.
        */
      var reportScope: js.UndefOr[AdGroupId] = js.native
      
      /**
        * Determines the type of rows that are returned in the report. For example, if you specify `reportType: keyword`, each row in the report will contain data about a keyword. See the
        * [Types of Reports](/search-ads/v2/report-types/) reference for the columns that are available for each type.
        */
      var reportType: js.UndefOr[String] = js.native
      
      /** Synchronous report only. The maximum number of rows to return; additional rows are dropped. Acceptable values are `0` to `10000`, inclusive. Defaults to `10000`. */
      var rowCount: js.UndefOr[Double] = js.native
      
      /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are `0` to `50000`, inclusive. Defaults to `0`. */
      var startRow: js.UndefOr[Double] = js.native
      
      /**
        * Specifies the currency in which monetary will be returned. Possible values are: `usd`, `agency` (valid if the report is scoped to agency or lower), `advertiser` (valid if the report
        * is scoped to * advertiser or lower), or `account` (valid if the report is scoped to engine account or lower).
        */
      var statisticsCurrency: js.UndefOr[String] = js.native
      
      /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
      var timeRange: js.UndefOr[ChangedAttributesSinceTimestamp] = js.native
      
      /** If `true`, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to `false`. */
      var verifySingleTimeZone: js.UndefOr[Boolean] = js.native
    }
    object ReportRequest {
      
      @scala.inline
      def apply(): ReportRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportRequest]
      }
      
      @scala.inline
      implicit class ReportRequestMutableBuilder[Self <: ReportRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[ReportApiColumnSpec]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setColumnsVarargs(value: ReportApiColumnSpec*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        @scala.inline
        def setDownloadFormat(value: String): Self = StObject.set(x, "downloadFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownloadFormatUndefined: Self = StObject.set(x, "downloadFormat", js.undefined)
        
        @scala.inline
        def setFilters(value: js.Array[Column]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        @scala.inline
        def setFiltersVarargs(value: Column*): Self = StObject.set(x, "filters", js.Array(value :_*))
        
        @scala.inline
        def setIncludeDeletedEntities(value: Boolean): Self = StObject.set(x, "includeDeletedEntities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeDeletedEntitiesUndefined: Self = StObject.set(x, "includeDeletedEntities", js.undefined)
        
        @scala.inline
        def setIncludeRemovedEntities(value: Boolean): Self = StObject.set(x, "includeRemovedEntities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeRemovedEntitiesUndefined: Self = StObject.set(x, "includeRemovedEntities", js.undefined)
        
        @scala.inline
        def setMaxRowsPerFile(value: Double): Self = StObject.set(x, "maxRowsPerFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxRowsPerFileUndefined: Self = StObject.set(x, "maxRowsPerFile", js.undefined)
        
        @scala.inline
        def setOrderBy(value: js.Array[SortOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        @scala.inline
        def setOrderByVarargs(value: SortOrder*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
        
        @scala.inline
        def setReportScope(value: AdGroupId): Self = StObject.set(x, "reportScope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportScopeUndefined: Self = StObject.set(x, "reportScope", js.undefined)
        
        @scala.inline
        def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
        
        @scala.inline
        def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        @scala.inline
        def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
        
        @scala.inline
        def setStatisticsCurrency(value: String): Self = StObject.set(x, "statisticsCurrency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatisticsCurrencyUndefined: Self = StObject.set(x, "statisticsCurrency", js.undefined)
        
        @scala.inline
        def setTimeRange(value: ChangedAttributesSinceTimestamp): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
        
        @scala.inline
        def setVerifySingleTimeZone(value: Boolean): Self = StObject.set(x, "verifySingleTimeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifySingleTimeZoneUndefined: Self = StObject.set(x, "verifySingleTimeZone", js.undefined)
      }
    }
    
    type ReportRow = StringDictionary[js.Any]
    
    @js.native
    trait ReportsResource extends StObject {
      
      def generate(request: Callback, body: ReportRequest): Request[Report] = js.native
      /** Generates and returns a report immediately. */
      def generate(request: Key): Request[Report] = js.native
      
      /** Polls for the status of a report request. */
      def get(): Request[Report] = js.native
      def get(request: Oauthtoken): Request[Report] = js.native
      
      /** Downloads a report file encoded in UTF-8. */
      def getFile(): Request[Unit] = js.native
      def getFile(request: PrettyPrint): Request[Unit] = js.native
      
      def request(request: Callback, body: ReportRequest): Request[Report] = js.native
      /** Inserts a report request into the reporting system. */
      def request(request: Key): Request[Report] = js.native
    }
    
    @js.native
    trait SavedColumn extends StObject {
      
      /** Identifies this as a SavedColumn resource. Value: the fixed string doubleclicksearch#savedColumn. */
      var kind: js.UndefOr[String] = js.native
      
      /** The name of the saved column. */
      var savedColumnName: js.UndefOr[String] = js.native
      
      /** The type of data this saved column will produce. */
      var `type`: js.UndefOr[String] = js.native
    }
    object SavedColumn {
      
      @scala.inline
      def apply(): SavedColumn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedColumn]
      }
      
      @scala.inline
      implicit class SavedColumnMutableBuilder[Self <: SavedColumn] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait SavedColumnList extends StObject {
      
      /** The saved columns being requested. */
      var items: js.UndefOr[js.Array[SavedColumn]] = js.native
      
      /** Identifies this as a SavedColumnList resource. Value: the fixed string doubleclicksearch#savedColumnList. */
      var kind: js.UndefOr[String] = js.native
    }
    object SavedColumnList {
      
      @scala.inline
      def apply(): SavedColumnList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedColumnList]
      }
      
      @scala.inline
      implicit class SavedColumnListMutableBuilder[Self <: SavedColumnList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[SavedColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: SavedColumn*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait SavedColumnsResource extends StObject {
      
      /** Retrieve the list of saved columns for a specified advertiser. */
      def list(): Request[SavedColumnList] = js.native
      def list(request: AdvertiserId): Request[SavedColumnList] = js.native
    }
    
    @js.native
    trait UpdateAvailabilityRequest extends StObject {
      
      /** The availabilities being requested. */
      var availabilities: js.UndefOr[js.Array[Availability]] = js.native
    }
    object UpdateAvailabilityRequest {
      
      @scala.inline
      def apply(): UpdateAvailabilityRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateAvailabilityRequest]
      }
      
      @scala.inline
      implicit class UpdateAvailabilityRequestMutableBuilder[Self <: UpdateAvailabilityRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAvailabilities(value: js.Array[Availability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
        
        @scala.inline
        def setAvailabilitiesVarargs(value: Availability*): Self = StObject.set(x, "availabilities", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UpdateAvailabilityResponse extends StObject {
      
      /** The availabilities being returned. */
      var availabilities: js.UndefOr[js.Array[Availability]] = js.native
    }
    object UpdateAvailabilityResponse {
      
      @scala.inline
      def apply(): UpdateAvailabilityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateAvailabilityResponse]
      }
      
      @scala.inline
      implicit class UpdateAvailabilityResponseMutableBuilder[Self <: UpdateAvailabilityResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAvailabilities(value: js.Array[Availability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
        
        @scala.inline
        def setAvailabilitiesVarargs(value: Availability*): Self = StObject.set(x, "availabilities", js.Array(value :_*))
      }
    }
  }
}
