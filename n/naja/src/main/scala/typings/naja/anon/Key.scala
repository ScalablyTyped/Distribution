package typings.naja.anon

import typings.naja.distCoreSnippetCacheMod.SnippetCacheKey
import typings.naja.distCoreSnippetCacheMod.SnippetCacheStorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  val key: SnippetCacheKey
  
  val storage: SnippetCacheStorageType
}
object Key {
  
  inline def apply(storage: SnippetCacheStorageType): Key = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], key = null)
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: SnippetCacheKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setStorage(value: SnippetCacheStorageType): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
