package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bson.mod.Document
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<mongodb.mongodb.CreateIndexesOptions, 'background' | 'unique' | 'partialFilterExpression' | 'sparse' | 'hidden' | 'expireAfterSeconds' | 'storageEngine' | 'version' | 'weights' | 'default_language' | 'language_override' | 'textIndexVersion' | '2dsphereIndexVersion' | 'bits' | 'min' | 'max' | 'bucketSize' | 'wildcardProjection'> */
trait IndexDescription extends StObject {
  
  var `2dsphereIndexVersion`: js.UndefOr[scala.Double] = js.undefined
  
  var background: js.UndefOr[Boolean] = js.undefined
  
  var bits: js.UndefOr[scala.Double] = js.undefined
  
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  var default_language: js.UndefOr[String] = js.undefined
  
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var key: StringDictionary[IndexDirection] | (Map[String, IndexDirection])
  
  var language_override: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var partialFilterExpression: js.UndefOr[Document] = js.undefined
  
  var sparse: js.UndefOr[Boolean] = js.undefined
  
  var storageEngine: js.UndefOr[Document] = js.undefined
  
  var textIndexVersion: js.UndefOr[scala.Double] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[scala.Double] = js.undefined
  
  var weights: js.UndefOr[Document] = js.undefined
  
  var wildcardProjection: js.UndefOr[Document] = js.undefined
}
object IndexDescription {
  
  inline def apply(key: StringDictionary[IndexDirection] | (Map[String, IndexDirection])): IndexDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexDescription] (val x: Self) extends AnyVal {
    
    inline def set2dsphereIndexVersion(value: scala.Double): Self = StObject.set(x, "2dsphereIndexVersion", value.asInstanceOf[js.Any])
    
    inline def set2dsphereIndexVersionUndefined: Self = StObject.set(x, "2dsphereIndexVersion", js.undefined)
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBits(value: scala.Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    inline def setBucketSize(value: scala.Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setDefault_language(value: String): Self = StObject.set(x, "default_language", value.asInstanceOf[js.Any])
    
    inline def setDefault_languageUndefined: Self = StObject.set(x, "default_language", js.undefined)
    
    inline def setExpireAfterSeconds(value: scala.Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setKey(value: StringDictionary[IndexDirection] | (Map[String, IndexDirection])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLanguage_override(value: String): Self = StObject.set(x, "language_override", value.asInstanceOf[js.Any])
    
    inline def setLanguage_overrideUndefined: Self = StObject.set(x, "language_override", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartialFilterExpression(value: Document): Self = StObject.set(x, "partialFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setPartialFilterExpressionUndefined: Self = StObject.set(x, "partialFilterExpression", js.undefined)
    
    inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    
    inline def setStorageEngine(value: Document): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    
    inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    
    inline def setTextIndexVersion(value: scala.Double): Self = StObject.set(x, "textIndexVersion", value.asInstanceOf[js.Any])
    
    inline def setTextIndexVersionUndefined: Self = StObject.set(x, "textIndexVersion", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def setVersion(value: scala.Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWeights(value: Document): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    inline def setWildcardProjection(value: Document): Self = StObject.set(x, "wildcardProjection", value.asInstanceOf[js.Any])
    
    inline def setWildcardProjectionUndefined: Self = StObject.set(x, "wildcardProjection", js.undefined)
  }
}
