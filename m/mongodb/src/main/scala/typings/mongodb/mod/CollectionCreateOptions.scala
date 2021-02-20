package typings.mongodb.mod

import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.moderate
import typings.mongodb.mongodbStrings.off
import typings.mongodb.mongodbStrings.strict
import typings.mongodb.mongodbStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionCreateOptions extends CommonOptions {
  
  var autoIndexId: js.UndefOr[Boolean] = js.native
  
  var capped: js.UndefOr[Boolean] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var flags: js.UndefOr[scala.Double] = js.native
  
  var indexOptionDefaults: js.UndefOr[js.Object] = js.native
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var pipeline: js.UndefOr[js.Array[_]] = js.native
  
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[scala.Double] = js.native
  
  var storageEngine: js.UndefOr[js.Object] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var validationAction: js.UndefOr[error | warn] = js.native
  
  var validationLevel: js.UndefOr[off | strict | moderate] = js.native
  
  var validator: js.UndefOr[js.Object] = js.native
  
  var viewOn: js.UndefOr[String] = js.native
}
object CollectionCreateOptions {
  
  @scala.inline
  def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
  
  @scala.inline
  implicit class CollectionCreateOptionsMutableBuilder[Self <: CollectionCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIndexId(value: Boolean): Self = StObject.set(x, "autoIndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndexIdUndefined: Self = StObject.set(x, "autoIndexId", js.undefined)
    
    @scala.inline
    def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCappedUndefined: Self = StObject.set(x, "capped", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFlags(value: scala.Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setIndexOptionDefaults(value: js.Object): Self = StObject.set(x, "indexOptionDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexOptionDefaultsUndefined: Self = StObject.set(x, "indexOptionDefaults", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setPipeline(value: js.Array[_]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setPipelineVarargs(value: js.Any*): Self = StObject.set(x, "pipeline", js.Array(value :_*))
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    @scala.inline
    def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStorageEngine(value: js.Object): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setValidationAction(value: error | warn): Self = StObject.set(x, "validationAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationActionUndefined: Self = StObject.set(x, "validationAction", js.undefined)
    
    @scala.inline
    def setValidationLevel(value: off | strict | moderate): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Object): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    @scala.inline
    def setViewOn(value: String): Self = StObject.set(x, "viewOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOnUndefined: Self = StObject.set(x, "viewOn", js.undefined)
  }
}
