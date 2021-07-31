package typings.orientjs.mod

import typings.orientjs.orientjsStrings.COLA
import typings.orientjs.orientjsStrings.DICTIONARY
import typings.orientjs.orientjsStrings.DICTIONARY_HASH_INDEX
import typings.orientjs.orientjsStrings.FULLTEXT
import typings.orientjs.orientjsStrings.FULLTEXT_HASH_INDEX
import typings.orientjs.orientjsStrings.LUCENE
import typings.orientjs.orientjsStrings.NOTUNIQUE
import typings.orientjs.orientjsStrings.NOTUNIQUE_HASH_INDEX
import typings.orientjs.orientjsStrings.SPATIAL
import typings.orientjs.orientjsStrings.UNIQUE
import typings.orientjs.orientjsStrings.UNIQUE_HASH_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexConfig extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var engine: js.UndefOr[LUCENE | COLA | String] = js.undefined
  
  var ifnotexist: js.UndefOr[Boolean] = js.undefined
  
  var keyType: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var name: String
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
}
object IndexConfig {
  
  @scala.inline
  def apply(
    name: String,
    `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
  ): IndexConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfig]
  }
  
  @scala.inline
  implicit class IndexConfigMutableBuilder[Self <: IndexConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setEngine(value: LUCENE | COLA | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setIfnotexist(value: Boolean): Self = StObject.set(x, "ifnotexist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfnotexistUndefined: Self = StObject.set(x, "ifnotexist", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
