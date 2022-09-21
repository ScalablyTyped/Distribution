package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wfsMod {
  
  @JSImport("ol/format/WFS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format/WFS", JSImport.Default)
  @js.native
  open class default () extends WFS {
    def this(opt_options: Options) = this()
  }
  
  inline def writeFilter(filter: typings.ol.filterFilterMod.default, version: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFilter")(filter.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  trait FeatureCollectionMetadata extends StObject {
    
    var bounds: Extent
    
    var numberOfFeatures: Double
  }
  object FeatureCollectionMetadata {
    
    inline def apply(bounds: Extent, numberOfFeatures: Double): FeatureCollectionMetadata = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], numberOfFeatures = numberOfFeatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCollectionMetadata]
    }
    
    extension [Self <: FeatureCollectionMetadata](x: Self) {
      
      inline def setBounds(value: Extent): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFeatures(value: Double): Self = StObject.set(x, "numberOfFeatures", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureType extends StObject {
    
    var bbox: Extent
    
    var geometryName: String
    
    var name: String
  }
  object FeatureType {
    
    inline def apply(bbox: Extent, geometryName: String, name: String): FeatureType = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], geometryName = geometryName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureType]
    }
    
    extension [Self <: FeatureType](x: Self) {
      
      inline def setBbox(value: Extent): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
    
    var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var gmlFormat: js.UndefOr[typings.ol.gmlbaseMod.default] = js.undefined
    
    var schemaLocation: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      inline def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
      
      inline def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
      
      inline def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value*))
      
      inline def setGmlFormat(value: typings.ol.gmlbaseMod.default): Self = StObject.set(x, "gmlFormat", value.asInstanceOf[js.Any])
      
      inline def setGmlFormatUndefined: Self = StObject.set(x, "gmlFormat", js.undefined)
      
      inline def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
      
      inline def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait TransactionResponse extends StObject {
    
    var insertIds: js.Array[String]
    
    var totalDeleted: Double
    
    var totalInserted: Double
    
    var totalUpdated: Double
  }
  object TransactionResponse {
    
    inline def apply(insertIds: js.Array[String], totalDeleted: Double, totalInserted: Double, totalUpdated: Double): TransactionResponse = {
      val __obj = js.Dynamic.literal(insertIds = insertIds.asInstanceOf[js.Any], totalDeleted = totalDeleted.asInstanceOf[js.Any], totalInserted = totalInserted.asInstanceOf[js.Any], totalUpdated = totalUpdated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionResponse]
    }
    
    extension [Self <: TransactionResponse](x: Self) {
      
      inline def setInsertIds(value: js.Array[String]): Self = StObject.set(x, "insertIds", value.asInstanceOf[js.Any])
      
      inline def setInsertIdsVarargs(value: String*): Self = StObject.set(x, "insertIds", js.Array(value*))
      
      inline def setTotalDeleted(value: Double): Self = StObject.set(x, "totalDeleted", value.asInstanceOf[js.Any])
      
      inline def setTotalInserted(value: Double): Self = StObject.set(x, "totalInserted", value.asInstanceOf[js.Any])
      
      inline def setTotalUpdated(value: Double): Self = StObject.set(x, "totalUpdated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WFS
    extends typings.ol.xmlfeatureMod.default {
    
    /**
      * Create a bbox filter and combine it with another optional filter.
      */
    def combineBboxAndFilter(geometryName: String, extent: Extent): typings.ol.filterFilterMod.default = js.native
    def combineBboxAndFilter(geometryName: String, extent: Extent, opt_srsName: String): typings.ol.filterFilterMod.default = js.native
    def combineBboxAndFilter(
      geometryName: String,
      extent: Extent,
      opt_srsName: String,
      opt_filter: typings.ol.filterFilterMod.default
    ): typings.ol.filterFilterMod.default = js.native
    def combineBboxAndFilter(
      geometryName: String,
      extent: Extent,
      opt_srsName: Unit,
      opt_filter: typings.ol.filterFilterMod.default
    ): typings.ol.filterFilterMod.default = js.native
    
    def getFeatureType(): js.UndefOr[js.Array[String] | String] = js.native
    
    def readFeatureCollectionMetadata(source: String): js.UndefOr[FeatureCollectionMetadata] = js.native
    def readFeatureCollectionMetadata(source: js.Object): js.UndefOr[FeatureCollectionMetadata] = js.native
    /**
      * Read feature collection metadata of the source.
      */
    def readFeatureCollectionMetadata(source: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
    def readFeatureCollectionMetadata(source: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readFeatureCollectionMetadataFromDocument(doc: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readFeatureCollectionMetadataFromNode(node: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readTransactionResponse(source: String): js.UndefOr[TransactionResponse] = js.native
    def readTransactionResponse(source: js.Object): js.UndefOr[TransactionResponse] = js.native
    /**
      * Read transaction response of the source.
      */
    def readTransactionResponse(source: Document): js.UndefOr[TransactionResponse] = js.native
    def readTransactionResponse(source: Element): js.UndefOr[TransactionResponse] = js.native
    
    def readTransactionResponseFromDocument(doc: Document): js.UndefOr[TransactionResponse] = js.native
    
    def readTransactionResponseFromNode(node: Element): js.UndefOr[TransactionResponse] = js.native
    
    def setFeatureType(): Unit = js.native
    def setFeatureType(featureType: String): Unit = js.native
    def setFeatureType(featureType: js.Array[String]): Unit = js.native
    
    /**
      * Encode format as WFS GetFeature and return the Node.
      */
    def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
    
    /**
      * Encode format as WFS Transaction and return the Node.
      */
    def writeTransaction(
      inserts: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      updates: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      deletes: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      options: WriteTransactionOptions
    ): Node = js.native
  }
  
  trait WriteGetFeatureOptions extends StObject {
    
    var bbox: js.UndefOr[Extent] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var featureNS: String
    
    var featurePrefix: String
    
    var featureTypes: js.Array[String | FeatureType]
    
    var filter: js.UndefOr[typings.ol.filterFilterMod.default] = js.undefined
    
    var geometryName: js.UndefOr[String] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var maxFeatures: js.UndefOr[Double] = js.undefined
    
    var outputFormat: js.UndefOr[String] = js.undefined
    
    var propertyNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var resultType: js.UndefOr[String] = js.undefined
    
    var srsName: js.UndefOr[String] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
    
    var viewParams: js.UndefOr[String] = js.undefined
  }
  object WriteGetFeatureOptions {
    
    inline def apply(featureNS: String, featurePrefix: String, featureTypes: js.Array[String | FeatureType]): WriteGetFeatureOptions = {
      val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteGetFeatureOptions]
    }
    
    extension [Self <: WriteGetFeatureOptions](x: Self) {
      
      inline def setBbox(value: Extent): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      inline def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
      
      inline def setFeatureTypes(value: js.Array[String | FeatureType]): Self = StObject.set(x, "featureTypes", value.asInstanceOf[js.Any])
      
      inline def setFeatureTypesVarargs(value: (String | FeatureType)*): Self = StObject.set(x, "featureTypes", js.Array(value*))
      
      inline def setFilter(value: typings.ol.filterFilterMod.default): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setMaxFeatures(value: Double): Self = StObject.set(x, "maxFeatures", value.asInstanceOf[js.Any])
      
      inline def setMaxFeaturesUndefined: Self = StObject.set(x, "maxFeatures", js.undefined)
      
      inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setPropertyNames(value: js.Array[String]): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      inline def setPropertyNamesVarargs(value: String*): Self = StObject.set(x, "propertyNames", js.Array(value*))
      
      inline def setResultType(value: String): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
      
      inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      
      inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      inline def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setViewParams(value: String): Self = StObject.set(x, "viewParams", value.asInstanceOf[js.Any])
      
      inline def setViewParamsUndefined: Self = StObject.set(x, "viewParams", js.undefined)
    }
  }
  
  trait WriteTransactionOptions extends StObject {
    
    var featureNS: String
    
    var featurePrefix: String
    
    var featureType: String
    
    var gmlOptions: js.UndefOr[typings.ol.gmlbaseMod.Options] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    var nativeElements: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var srsName: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object WriteTransactionOptions {
    
    inline def apply(featureNS: String, featurePrefix: String, featureType: String): WriteTransactionOptions = {
      val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteTransactionOptions]
    }
    
    extension [Self <: WriteTransactionOptions](x: Self) {
      
      inline def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      inline def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
      
      inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setGmlOptions(value: typings.ol.gmlbaseMod.Options): Self = StObject.set(x, "gmlOptions", value.asInstanceOf[js.Any])
      
      inline def setGmlOptionsUndefined: Self = StObject.set(x, "gmlOptions", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      inline def setNativeElements(value: js.Array[js.Object]): Self = StObject.set(x, "nativeElements", value.asInstanceOf[js.Any])
      
      inline def setNativeElementsUndefined: Self = StObject.set(x, "nativeElements", js.undefined)
      
      inline def setNativeElementsVarargs(value: js.Object*): Self = StObject.set(x, "nativeElements", js.Array(value*))
      
      inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      inline def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
