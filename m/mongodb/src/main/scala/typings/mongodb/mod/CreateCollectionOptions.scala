package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionOptions
  extends StObject
     with CommandOperationOptions {
  
  /** @deprecated Create an index on the _id field of the document, True by default on MongoDB 2.6 - 3.0 */
  var autoIndexId: js.UndefOr[Boolean] = js.undefined
  
  /** Create a capped collection */
  var capped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, enables pre-update and post-update document events to be included for any
    * change streams that listen on this collection.
    */
  var changeStreamPreAndPostImages: js.UndefOr[Enabled] = js.undefined
  
  /** A document specifying configuration options for clustered collections. For MongoDB 5.3 and above. */
  var clusteredIndex: js.UndefOr[ClusteredCollectionOptions] = js.undefined
  
  /** @experimental */
  var encryptedFields: js.UndefOr[Document] = js.undefined
  
  /** The number of seconds after which a document in a timeseries or clustered collection expires. */
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  
  /** Available for the MMAPv1 storage engine only to set the usePowerOf2Sizes and the noPadding flag */
  var flags: js.UndefOr[scala.Double] = js.undefined
  
  /** Allows users to specify a default configuration for indexes when creating a collection on MongoDB 3.2 or higher */
  var indexOptionDefaults: js.UndefOr[Document] = js.undefined
  
  /** The maximum number of documents in the capped collection */
  var max: js.UndefOr[scala.Double] = js.undefined
  
  /** An array that consists of the aggregation pipeline stage. Creates the view by applying the specified pipeline to the viewOn collection or view on MongoDB 3.4 or higher */
  var pipeline: js.UndefOr[js.Array[Document]] = js.undefined
  
  /** A primary key factory function for generation of custom _id keys. */
  var pkFactory: js.UndefOr[PkFactory] = js.undefined
  
  /** The size of the capped collection in bytes */
  var size: js.UndefOr[scala.Double] = js.undefined
  
  /** Allows users to specify configuration to the storage engine on a per-collection basis when creating a collection on MongoDB 3.0 or higher */
  var storageEngine: js.UndefOr[Document] = js.undefined
  
  /** Returns an error if the collection does not exist */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /** A document specifying configuration options for timeseries collections. */
  var timeseries: js.UndefOr[TimeSeriesCollectionOptions] = js.undefined
  
  /** Determines whether to error on invalid documents or just warn about the violations but allow invalid documents to be inserted on MongoDB 3.2 or higher */
  var validationAction: js.UndefOr[String] = js.undefined
  
  /** Determines how strictly MongoDB applies the validation rules to existing documents during an update on MongoDB 3.2 or higher */
  var validationLevel: js.UndefOr[String] = js.undefined
  
  /** Allows users to specify validation rules or expressions for the collection. For more information, see Document Validation on MongoDB 3.2 or higher */
  var validator: js.UndefOr[Document] = js.undefined
  
  /** The name of the source collection or view from which to create the view. The name is not the full namespace of the collection or view; i.e. does not include the database name and implies the same database as the view to create on MongoDB 3.4 or higher */
  var viewOn: js.UndefOr[String] = js.undefined
}
object CreateCollectionOptions {
  
  inline def apply(): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionOptions]
  }
  
  extension [Self <: CreateCollectionOptions](x: Self) {
    
    inline def setAutoIndexId(value: Boolean): Self = StObject.set(x, "autoIndexId", value.asInstanceOf[js.Any])
    
    inline def setAutoIndexIdUndefined: Self = StObject.set(x, "autoIndexId", js.undefined)
    
    inline def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    inline def setCappedUndefined: Self = StObject.set(x, "capped", js.undefined)
    
    inline def setChangeStreamPreAndPostImages(value: Enabled): Self = StObject.set(x, "changeStreamPreAndPostImages", value.asInstanceOf[js.Any])
    
    inline def setChangeStreamPreAndPostImagesUndefined: Self = StObject.set(x, "changeStreamPreAndPostImages", js.undefined)
    
    inline def setClusteredIndex(value: ClusteredCollectionOptions): Self = StObject.set(x, "clusteredIndex", value.asInstanceOf[js.Any])
    
    inline def setClusteredIndexUndefined: Self = StObject.set(x, "clusteredIndex", js.undefined)
    
    inline def setEncryptedFields(value: Document): Self = StObject.set(x, "encryptedFields", value.asInstanceOf[js.Any])
    
    inline def setEncryptedFieldsUndefined: Self = StObject.set(x, "encryptedFields", js.undefined)
    
    inline def setExpireAfterSeconds(value: scala.Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
    
    inline def setFlags(value: scala.Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setIndexOptionDefaults(value: Document): Self = StObject.set(x, "indexOptionDefaults", value.asInstanceOf[js.Any])
    
    inline def setIndexOptionDefaultsUndefined: Self = StObject.set(x, "indexOptionDefaults", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setPipeline(value: js.Array[Document]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPipelineVarargs(value: Document*): Self = StObject.set(x, "pipeline", js.Array(value*))
    
    inline def setPkFactory(value: PkFactory): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    inline def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageEngine(value: Document): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    
    inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTimeseries(value: TimeSeriesCollectionOptions): Self = StObject.set(x, "timeseries", value.asInstanceOf[js.Any])
    
    inline def setTimeseriesUndefined: Self = StObject.set(x, "timeseries", js.undefined)
    
    inline def setValidationAction(value: String): Self = StObject.set(x, "validationAction", value.asInstanceOf[js.Any])
    
    inline def setValidationActionUndefined: Self = StObject.set(x, "validationAction", js.undefined)
    
    inline def setValidationLevel(value: String): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
    
    inline def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
    
    inline def setValidator(value: Document): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setViewOn(value: String): Self = StObject.set(x, "viewOn", value.asInstanceOf[js.Any])
    
    inline def setViewOnUndefined: Self = StObject.set(x, "viewOn", js.undefined)
  }
}
