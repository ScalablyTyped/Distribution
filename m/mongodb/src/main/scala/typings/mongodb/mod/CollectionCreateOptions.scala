package typings.mongodb.mod

import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.moderate
import typings.mongodb.mongodbStrings.off
import typings.mongodb.mongodbStrings.strict
import typings.mongodb.mongodbStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionCreateOptions
  extends StObject
     with CommonOptions {
  
  var autoIndexId: js.UndefOr[Boolean] = js.undefined
  
  var capped: js.UndefOr[Boolean] = js.undefined
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var flags: js.UndefOr[scala.Double] = js.undefined
  
  var indexOptionDefaults: js.UndefOr[js.Object] = js.undefined
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var pipeline: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[scala.Double] = js.undefined
  
  var storageEngine: js.UndefOr[js.Object] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var validationAction: js.UndefOr[error | warn] = js.undefined
  
  var validationLevel: js.UndefOr[off | strict | moderate] = js.undefined
  
  var validator: js.UndefOr[js.Object] = js.undefined
  
  var viewOn: js.UndefOr[String] = js.undefined
}
object CollectionCreateOptions {
  
  inline def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
  
  extension [Self <: CollectionCreateOptions](x: Self) {
    
    inline def setAutoIndexId(value: Boolean): Self = StObject.set(x, "autoIndexId", value.asInstanceOf[js.Any])
    
    inline def setAutoIndexIdUndefined: Self = StObject.set(x, "autoIndexId", js.undefined)
    
    inline def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    inline def setCappedUndefined: Self = StObject.set(x, "capped", js.undefined)
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFlags(value: scala.Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setIndexOptionDefaults(value: js.Object): Self = StObject.set(x, "indexOptionDefaults", value.asInstanceOf[js.Any])
    
    inline def setIndexOptionDefaultsUndefined: Self = StObject.set(x, "indexOptionDefaults", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setPipeline(value: js.Array[js.Any]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPipelineVarargs(value: js.Any*): Self = StObject.set(x, "pipeline", js.Array(value :_*))
    
    inline def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    inline def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageEngine(value: js.Object): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    
    inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setValidationAction(value: error | warn): Self = StObject.set(x, "validationAction", value.asInstanceOf[js.Any])
    
    inline def setValidationActionUndefined: Self = StObject.set(x, "validationAction", js.undefined)
    
    inline def setValidationLevel(value: off | strict | moderate): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
    
    inline def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
    
    inline def setValidator(value: js.Object): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setViewOn(value: String): Self = StObject.set(x, "viewOn", value.asInstanceOf[js.Any])
    
    inline def setViewOnUndefined: Self = StObject.set(x, "viewOn", js.undefined)
  }
}
