package typings.maximMazurokGapiClientDoubleclicksearch.gapi.client

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclicksearch {
  
  trait Availability extends StObject {
    
    /** DS advertiser ID. */
    var advertiserId: js.UndefOr[String] = js.undefined
    
    /** DS agency ID. */
    var agencyId: js.UndefOr[String] = js.undefined
    
    /** The time by which all conversions have been uploaded, in epoch millis UTC. */
    var availabilityTimestamp: js.UndefOr[String] = js.undefined
    
    /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
    var segmentationId: js.UndefOr[String] = js.undefined
    
    /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
    var segmentationName: js.UndefOr[String] = js.undefined
    
    /** The segmentation type that this availability is for (its default value is `FLOODLIGHT`). */
    var segmentationType: js.UndefOr[String] = js.undefined
  }
  object Availability {
    
    inline def apply(): Availability = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Availability]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Availability] (val x: Self) extends AnyVal {
      
      inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
      
      inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
      
      inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
      
      inline def setAvailabilityTimestamp(value: String): Self = StObject.set(x, "availabilityTimestamp", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityTimestampUndefined: Self = StObject.set(x, "availabilityTimestamp", js.undefined)
      
      inline def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
      
      inline def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
      
      inline def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
      
      inline def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
      
      inline def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
      
      inline def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
    }
  }
  
  trait Conversion extends StObject {
    
    /** DS ad group ID. */
    var adGroupId: js.UndefOr[String] = js.undefined
    
    /** DS ad ID. */
    var adId: js.UndefOr[String] = js.undefined
    
    /** DS advertiser ID. */
    var advertiserId: js.UndefOr[String] = js.undefined
    
    /** DS agency ID. */
    var agencyId: js.UndefOr[String] = js.undefined
    
    /** Available to advertisers only after contacting DoubleClick Search customer support. */
    var attributionModel: js.UndefOr[String] = js.undefined
    
    /** DS campaign ID. */
    var campaignId: js.UndefOr[String] = js.undefined
    
    /** Sales channel for the product. Acceptable values are: - "`local`": a physical store - "`online`": an online store */
    var channel: js.UndefOr[String] = js.undefined
    
    /** DS click ID for the conversion. */
    var clickId: js.UndefOr[String] = js.undefined
    
    /**
      * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is meaningful to them. Each conversion in a request must specify a unique ID, and the
      * combination of ID and timestamp must be unique amongst all conversions within the advertiser. For online conversions, DS copies the `dsConversionId` or `floodlightOrderId` into this
      * property depending on the advertiser's Floodlight instructions.
      */
    var conversionId: js.UndefOr[String] = js.undefined
    
    /** The time at which the conversion was last modified, in epoch millis UTC. */
    var conversionModifiedTimestamp: js.UndefOr[String] = js.undefined
    
    /** The time at which the conversion took place, in epoch millis UTC. */
    var conversionTimestamp: js.UndefOr[String] = js.undefined
    
    /** Available to advertisers only after contacting DoubleClick Search customer support. */
    var countMillis: js.UndefOr[String] = js.undefined
    
    /** DS criterion (keyword) ID. */
    var criterionId: js.UndefOr[String] = js.undefined
    
    /** The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char) format. */
    var currencyCode: js.UndefOr[String] = js.undefined
    
    /** Custom dimensions for the conversion, which can be used to filter data in a report. */
    var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.undefined
    
    /** Custom metrics for the conversion. */
    var customMetric: js.UndefOr[js.Array[CustomMetric]] = js.undefined
    
    /** The type of device on which the conversion occurred. */
    var deviceType: js.UndefOr[String] = js.undefined
    
    /** ID that DoubleClick Search generates for each conversion. */
    var dsConversionId: js.UndefOr[String] = js.undefined
    
    /** DS engine account ID. */
    var engineAccountId: js.UndefOr[String] = js.undefined
    
    /** The Floodlight order ID provided by the advertiser for the conversion. */
    var floodlightOrderId: js.UndefOr[String] = js.undefined
    
    /** ID that DS generates and uses to uniquely identify the inventory account that contains the product. */
    var inventoryAccountId: js.UndefOr[String] = js.undefined
    
    /** The country registered for the Merchant Center feed that contains the product. Use an ISO 3166 code to specify a country. */
    var productCountry: js.UndefOr[String] = js.undefined
    
    /** DS product group ID. */
    var productGroupId: js.UndefOr[String] = js.undefined
    
    /** The product ID (SKU). */
    var productId: js.UndefOr[String] = js.undefined
    
    /** The language registered for the Merchant Center feed that contains the product. Use an ISO 639 code to specify a language. */
    var productLanguage: js.UndefOr[String] = js.undefined
    
    /** The quantity of this conversion, in millis. */
    var quantityMillis: js.UndefOr[String] = js.undefined
    
    /**
      * The revenue amount of this `TRANSACTION` conversion, in micros (value multiplied by 1000000, no decimal). For example, to specify a revenue value of "10" enter "10000000" (10
      * million) in your request.
      */
    var revenueMicros: js.UndefOr[String] = js.undefined
    
    /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
    var segmentationId: js.UndefOr[String] = js.undefined
    
    /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
    var segmentationName: js.UndefOr[String] = js.undefined
    
    /** The segmentation type of this conversion (for example, `FLOODLIGHT`). */
    var segmentationType: js.UndefOr[String] = js.undefined
    
    /** The state of the conversion, that is, either `ACTIVE` or `REMOVED`. Note: state DELETED is deprecated. */
    var state: js.UndefOr[String] = js.undefined
    
    /** The ID of the local store for which the product was advertised. Applicable only when the channel is "`local`". */
    var storeId: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the conversion, that is, either `ACTION` or `TRANSACTION`. An `ACTION` conversion is an action by the user that has no monetarily quantifiable value, while a
      * `TRANSACTION` conversion is an action that does have a monetarily quantifiable value. Examples are email list signups (`ACTION`) versus ecommerce purchases (`TRANSACTION`).
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Conversion {
    
    inline def apply(): Conversion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Conversion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conversion] (val x: Self) extends AnyVal {
      
      inline def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
      
      inline def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
      
      inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
      
      inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
      
      inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
      
      inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
      
      inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
      
      inline def setAttributionModel(value: String): Self = StObject.set(x, "attributionModel", value.asInstanceOf[js.Any])
      
      inline def setAttributionModelUndefined: Self = StObject.set(x, "attributionModel", js.undefined)
      
      inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setClickId(value: String): Self = StObject.set(x, "clickId", value.asInstanceOf[js.Any])
      
      inline def setClickIdUndefined: Self = StObject.set(x, "clickId", js.undefined)
      
      inline def setConversionId(value: String): Self = StObject.set(x, "conversionId", value.asInstanceOf[js.Any])
      
      inline def setConversionIdUndefined: Self = StObject.set(x, "conversionId", js.undefined)
      
      inline def setConversionModifiedTimestamp(value: String): Self = StObject.set(x, "conversionModifiedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConversionModifiedTimestampUndefined: Self = StObject.set(x, "conversionModifiedTimestamp", js.undefined)
      
      inline def setConversionTimestamp(value: String): Self = StObject.set(x, "conversionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConversionTimestampUndefined: Self = StObject.set(x, "conversionTimestamp", js.undefined)
      
      inline def setCountMillis(value: String): Self = StObject.set(x, "countMillis", value.asInstanceOf[js.Any])
      
      inline def setCountMillisUndefined: Self = StObject.set(x, "countMillis", js.undefined)
      
      inline def setCriterionId(value: String): Self = StObject.set(x, "criterionId", value.asInstanceOf[js.Any])
      
      inline def setCriterionIdUndefined: Self = StObject.set(x, "criterionId", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
      
      inline def setCustomDimension(value: js.Array[CustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
      
      inline def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
      
      inline def setCustomDimensionVarargs(value: CustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value*))
      
      inline def setCustomMetric(value: js.Array[CustomMetric]): Self = StObject.set(x, "customMetric", value.asInstanceOf[js.Any])
      
      inline def setCustomMetricUndefined: Self = StObject.set(x, "customMetric", js.undefined)
      
      inline def setCustomMetricVarargs(value: CustomMetric*): Self = StObject.set(x, "customMetric", js.Array(value*))
      
      inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
      
      inline def setDsConversionId(value: String): Self = StObject.set(x, "dsConversionId", value.asInstanceOf[js.Any])
      
      inline def setDsConversionIdUndefined: Self = StObject.set(x, "dsConversionId", js.undefined)
      
      inline def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
      
      inline def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
      
      inline def setFloodlightOrderId(value: String): Self = StObject.set(x, "floodlightOrderId", value.asInstanceOf[js.Any])
      
      inline def setFloodlightOrderIdUndefined: Self = StObject.set(x, "floodlightOrderId", js.undefined)
      
      inline def setInventoryAccountId(value: String): Self = StObject.set(x, "inventoryAccountId", value.asInstanceOf[js.Any])
      
      inline def setInventoryAccountIdUndefined: Self = StObject.set(x, "inventoryAccountId", js.undefined)
      
      inline def setProductCountry(value: String): Self = StObject.set(x, "productCountry", value.asInstanceOf[js.Any])
      
      inline def setProductCountryUndefined: Self = StObject.set(x, "productCountry", js.undefined)
      
      inline def setProductGroupId(value: String): Self = StObject.set(x, "productGroupId", value.asInstanceOf[js.Any])
      
      inline def setProductGroupIdUndefined: Self = StObject.set(x, "productGroupId", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setProductLanguage(value: String): Self = StObject.set(x, "productLanguage", value.asInstanceOf[js.Any])
      
      inline def setProductLanguageUndefined: Self = StObject.set(x, "productLanguage", js.undefined)
      
      inline def setQuantityMillis(value: String): Self = StObject.set(x, "quantityMillis", value.asInstanceOf[js.Any])
      
      inline def setQuantityMillisUndefined: Self = StObject.set(x, "quantityMillis", js.undefined)
      
      inline def setRevenueMicros(value: String): Self = StObject.set(x, "revenueMicros", value.asInstanceOf[js.Any])
      
      inline def setRevenueMicrosUndefined: Self = StObject.set(x, "revenueMicros", js.undefined)
      
      inline def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
      
      inline def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
      
      inline def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
      
      inline def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
      
      inline def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
      
      inline def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ConversionList extends StObject {
    
    /** The conversions being requested. */
    var conversion: js.UndefOr[js.Array[Conversion]] = js.undefined
    
    /** Identifies this as a ConversionList resource. Value: the fixed string doubleclicksearch#conversionList. */
    var kind: js.UndefOr[String] = js.undefined
  }
  object ConversionList {
    
    inline def apply(): ConversionList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversionList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConversionList] (val x: Self) extends AnyVal {
      
      inline def setConversion(value: js.Array[Conversion]): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
      
      inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
      
      inline def setConversionVarargs(value: Conversion*): Self = StObject.set(x, "conversion", js.Array(value*))
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
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
  
  trait CustomDimension extends StObject {
    
    /** Custom dimension name. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Custom dimension value. */
    var value: js.UndefOr[String] = js.undefined
  }
  object CustomDimension {
    
    inline def apply(): CustomDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomDimension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomDimension] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CustomMetric extends StObject {
    
    /** Custom metric name. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Custom metric numeric value. */
    var value: js.UndefOr[Double] = js.undefined
  }
  object CustomMetric {
    
    inline def apply(): CustomMetric = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomMetric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomMetric] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line:no-empty-interface
  trait IdMappingFile extends StObject
  
  trait Report extends StObject {
    
    /** Asynchronous report only. Contains a list of generated report files once the report has successfully completed. */
    var files: js.UndefOr[js.Array[ByteCount]] = js.undefined
    
    /** Asynchronous report only. Id of the report. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Asynchronous report only. True if and only if the report has completed successfully and the report files are ready to be downloaded. */
    var isReportReady: js.UndefOr[Boolean] = js.undefined
    
    /** Identifies this as a Report resource. Value: the fixed string `doubleclicksearch#report`. */
    var kind: js.UndefOr[String] = js.undefined
    
    /** The request that created the report. Optional fields not specified in the original request are filled with default values. */
    var request: js.UndefOr[ReportRequest] = js.undefined
    
    /** The number of report rows generated by the report, not including headers. */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Synchronous report only. Generated report rows. */
    var rows: js.UndefOr[js.Array[ReportRow]] = js.undefined
    
    /**
      * The currency code of all monetary values produced in the report, including values that are set by users (e.g., keyword bid settings) and metrics (e.g., cost and revenue). The
      * currency code of a report is determined by the `statisticsCurrency` field of the report request.
      */
    var statisticsCurrencyCode: js.UndefOr[String] = js.undefined
    
    /** If all statistics of the report are sourced from the same time zone, this would be it. Otherwise the field is unset. */
    var statisticsTimeZone: js.UndefOr[String] = js.undefined
  }
  object Report {
    
    inline def apply(): Report = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Report]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[ByteCount]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: ByteCount*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsReportReady(value: Boolean): Self = StObject.set(x, "isReportReady", value.asInstanceOf[js.Any])
      
      inline def setIsReportReadyUndefined: Self = StObject.set(x, "isReportReady", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setRequest(value: ReportRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setRows(value: js.Array[ReportRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: ReportRow*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setStatisticsCurrencyCode(value: String): Self = StObject.set(x, "statisticsCurrencyCode", value.asInstanceOf[js.Any])
      
      inline def setStatisticsCurrencyCodeUndefined: Self = StObject.set(x, "statisticsCurrencyCode", js.undefined)
      
      inline def setStatisticsTimeZone(value: String): Self = StObject.set(x, "statisticsTimeZone", value.asInstanceOf[js.Any])
      
      inline def setStatisticsTimeZoneUndefined: Self = StObject.set(x, "statisticsTimeZone", js.undefined)
    }
  }
  
  trait ReportApiColumnSpec extends StObject {
    
    /** Name of a DoubleClick Search column to include in the report. */
    var columnName: js.UndefOr[String] = js.undefined
    
    /**
      * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower, and the custom dimension must already be set up in DoubleClick Search. The custom
      * dimension name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report, returns the value of the specified custom dimension for the given
      * conversion, if set. This column does not segment the conversion report.
      */
    var customDimensionName: js.UndefOr[String] = js.undefined
    
    /**
      * Name of a custom metric to include in the report. The report must be scoped to an advertiser or lower, and the custom metric must already be set up in DoubleClick Search. The custom
      * metric name, which appears in DoubleClick Search, is case sensitive.
      */
    var customMetricName: js.UndefOr[String] = js.undefined
    
    /** Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `startDate`. */
    var endDate: js.UndefOr[String] = js.undefined
    
    /** Synchronous report only. Set to `true` to group by this column. Defaults to `false`. */
    var groupByColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text used to identify this column in the report output; defaults to `columnName` or `savedColumnName` when not specified. This can be used to prevent collisions between DoubleClick
      * Search columns and saved columns with the same name.
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** The platform that is used to provide data for the custom dimension. Acceptable values are "floodlight". */
    var platformSource: js.UndefOr[String] = js.undefined
    
    /**
      * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`": returns metrics only for products that were sold - "`advertised`": returns metrics
      * only for products that were advertised in a Shopping campaign, and that might or might not have been sold
      */
    var productReportPerspective: js.UndefOr[String] = js.undefined
    
    /** Name of a saved column to include in the report. The report must be scoped at advertiser or lower, and this saved column must already be created in the DoubleClick Search UI. */
    var savedColumnName: js.UndefOr[String] = js.undefined
    
    /** Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `endDate`. */
    var startDate: js.UndefOr[String] = js.undefined
  }
  object ReportApiColumnSpec {
    
    inline def apply(): ReportApiColumnSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportApiColumnSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportApiColumnSpec] (val x: Self) extends AnyVal {
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setCustomDimensionName(value: String): Self = StObject.set(x, "customDimensionName", value.asInstanceOf[js.Any])
      
      inline def setCustomDimensionNameUndefined: Self = StObject.set(x, "customDimensionName", js.undefined)
      
      inline def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
      
      inline def setCustomMetricNameUndefined: Self = StObject.set(x, "customMetricName", js.undefined)
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setGroupByColumn(value: Boolean): Self = StObject.set(x, "groupByColumn", value.asInstanceOf[js.Any])
      
      inline def setGroupByColumnUndefined: Self = StObject.set(x, "groupByColumn", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setPlatformSource(value: String): Self = StObject.set(x, "platformSource", value.asInstanceOf[js.Any])
      
      inline def setPlatformSourceUndefined: Self = StObject.set(x, "platformSource", js.undefined)
      
      inline def setProductReportPerspective(value: String): Self = StObject.set(x, "productReportPerspective", value.asInstanceOf[js.Any])
      
      inline def setProductReportPerspectiveUndefined: Self = StObject.set(x, "productReportPerspective", js.undefined)
      
      inline def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
      
      inline def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait ReportRequest extends StObject {
    
    /**
      * The columns to include in the report. This includes both DoubleClick Search columns and saved columns. For DoubleClick Search columns, only the `columnName` parameter is required.
      * For saved columns only the `savedColumnName` parameter is required. Both `columnName` and `savedColumnName` cannot be set in the same stanza.\ The maximum number of columns per
      * request is 300.
      */
    var columns: js.UndefOr[js.Array[ReportApiColumnSpec]] = js.undefined
    
    /** Format that the report should be returned in. Currently `csv` or `tsv` is supported. */
    var downloadFormat: js.UndefOr[String] = js.undefined
    
    /** A list of filters to be applied to the report.\ The maximum number of filters per request is 300. */
    var filters: js.UndefOr[js.Array[Column]] = js.undefined
    
    /** Determines if removed entities should be included in the report. Defaults to `false`. Deprecated, please use `includeRemovedEntities` instead. */
    var includeDeletedEntities: js.UndefOr[Boolean] = js.undefined
    
    /** Determines if removed entities should be included in the report. Defaults to `false`. */
    var includeRemovedEntities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values are `1000000` to `100000000`,
      * inclusive.
      */
    var maxRowsPerFile: js.UndefOr[Double] = js.undefined
    
    /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows.\ The maximum number of orderings per request is 300. */
    var orderBy: js.UndefOr[js.Array[SortOrder]] = js.undefined
    
    /**
      * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the lowest scoped level desired up
      * through agency is required.
      */
    var reportScope: js.UndefOr[AdGroupId] = js.undefined
    
    /**
      * Determines the type of rows that are returned in the report. For example, if you specify `reportType: keyword`, each row in the report will contain data about a keyword. See the
      * [Types of Reports](/search-ads/v2/report-types/) reference for the columns that are available for each type.
      */
    var reportType: js.UndefOr[String] = js.undefined
    
    /** Synchronous report only. The maximum number of rows to return; additional rows are dropped. Acceptable values are `0` to `10000`, inclusive. Defaults to `10000`. */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are `0` to `50000`, inclusive. Defaults to `0`. */
    var startRow: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the currency in which monetary will be returned. Possible values are: `usd`, `agency` (valid if the report is scoped to agency or lower), `advertiser` (valid if the report
      * is scoped to * advertiser or lower), or `account` (valid if the report is scoped to engine account or lower).
      */
    var statisticsCurrency: js.UndefOr[String] = js.undefined
    
    /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
    var timeRange: js.UndefOr[ChangedAttributesSinceTimestamp] = js.undefined
    
    /** If `true`, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to `false`. */
    var verifySingleTimeZone: js.UndefOr[Boolean] = js.undefined
  }
  object ReportRequest {
    
    inline def apply(): ReportRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportRequest] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[ReportApiColumnSpec]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ReportApiColumnSpec*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDownloadFormat(value: String): Self = StObject.set(x, "downloadFormat", value.asInstanceOf[js.Any])
      
      inline def setDownloadFormatUndefined: Self = StObject.set(x, "downloadFormat", js.undefined)
      
      inline def setFilters(value: js.Array[Column]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Column*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setIncludeDeletedEntities(value: Boolean): Self = StObject.set(x, "includeDeletedEntities", value.asInstanceOf[js.Any])
      
      inline def setIncludeDeletedEntitiesUndefined: Self = StObject.set(x, "includeDeletedEntities", js.undefined)
      
      inline def setIncludeRemovedEntities(value: Boolean): Self = StObject.set(x, "includeRemovedEntities", value.asInstanceOf[js.Any])
      
      inline def setIncludeRemovedEntitiesUndefined: Self = StObject.set(x, "includeRemovedEntities", js.undefined)
      
      inline def setMaxRowsPerFile(value: Double): Self = StObject.set(x, "maxRowsPerFile", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsPerFileUndefined: Self = StObject.set(x, "maxRowsPerFile", js.undefined)
      
      inline def setOrderBy(value: js.Array[SortOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setOrderByVarargs(value: SortOrder*): Self = StObject.set(x, "orderBy", js.Array(value*))
      
      inline def setReportScope(value: AdGroupId): Self = StObject.set(x, "reportScope", value.asInstanceOf[js.Any])
      
      inline def setReportScopeUndefined: Self = StObject.set(x, "reportScope", js.undefined)
      
      inline def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
      
      inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
      
      inline def setStatisticsCurrency(value: String): Self = StObject.set(x, "statisticsCurrency", value.asInstanceOf[js.Any])
      
      inline def setStatisticsCurrencyUndefined: Self = StObject.set(x, "statisticsCurrency", js.undefined)
      
      inline def setTimeRange(value: ChangedAttributesSinceTimestamp): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
      
      inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
      
      inline def setVerifySingleTimeZone(value: Boolean): Self = StObject.set(x, "verifySingleTimeZone", value.asInstanceOf[js.Any])
      
      inline def setVerifySingleTimeZoneUndefined: Self = StObject.set(x, "verifySingleTimeZone", js.undefined)
    }
  }
  
  type ReportRow = StringDictionary[Any]
  
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
    
    /**
      * Downloads a csv file(encoded in UTF-8) that contains ID mappings between legacy SA360 and new SA360. The file includes all children entities of the given advertiser(e.g. engine
      * accounts, campaigns, ad groups, etc.) that exist in both legacy SA360 and new SA360.
      */
    def getIdMappingFile(): Request[js.Object] = js.native
    def getIdMappingFile(request: AdvertiserId): Request[js.Object] = js.native
    
    def request(request: Callback, body: ReportRequest): Request[Report] = js.native
    /** Inserts a report request into the reporting system. */
    def request(request: Key): Request[Report] = js.native
  }
  
  trait SavedColumn extends StObject {
    
    /** Identifies this as a SavedColumn resource. Value: the fixed string doubleclicksearch#savedColumn. */
    var kind: js.UndefOr[String] = js.undefined
    
    /** The name of the saved column. */
    var savedColumnName: js.UndefOr[String] = js.undefined
    
    /** The type of data this saved column will produce. */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SavedColumn {
    
    inline def apply(): SavedColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SavedColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SavedColumn] (val x: Self) extends AnyVal {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
      
      inline def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SavedColumnList extends StObject {
    
    /** The saved columns being requested. */
    var items: js.UndefOr[js.Array[SavedColumn]] = js.undefined
    
    /** Identifies this as a SavedColumnList resource. Value: the fixed string doubleclicksearch#savedColumnList. */
    var kind: js.UndefOr[String] = js.undefined
  }
  object SavedColumnList {
    
    inline def apply(): SavedColumnList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SavedColumnList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SavedColumnList] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[SavedColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SavedColumn*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
  
  @js.native
  trait SavedColumnsResource extends StObject {
    
    /** Retrieve the list of saved columns for a specified advertiser. */
    def list(): Request[SavedColumnList] = js.native
    def list(request: AdvertiserId): Request[SavedColumnList] = js.native
  }
  
  trait UpdateAvailabilityRequest extends StObject {
    
    /** The availabilities being requested. */
    var availabilities: js.UndefOr[js.Array[Availability]] = js.undefined
  }
  object UpdateAvailabilityRequest {
    
    inline def apply(): UpdateAvailabilityRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAvailabilityRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateAvailabilityRequest] (val x: Self) extends AnyVal {
      
      inline def setAvailabilities(value: js.Array[Availability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
      
      inline def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
      
      inline def setAvailabilitiesVarargs(value: Availability*): Self = StObject.set(x, "availabilities", js.Array(value*))
    }
  }
  
  trait UpdateAvailabilityResponse extends StObject {
    
    /** The availabilities being returned. */
    var availabilities: js.UndefOr[js.Array[Availability]] = js.undefined
  }
  object UpdateAvailabilityResponse {
    
    inline def apply(): UpdateAvailabilityResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAvailabilityResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateAvailabilityResponse] (val x: Self) extends AnyVal {
      
      inline def setAvailabilities(value: js.Array[Availability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
      
      inline def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
      
      inline def setAvailabilitiesVarargs(value: Availability*): Self = StObject.set(x, "availabilities", js.Array(value*))
    }
  }
}
