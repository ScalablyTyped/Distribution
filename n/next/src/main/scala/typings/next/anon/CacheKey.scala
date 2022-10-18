package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKey extends StObject {
  
  var cacheKey: String
  
  var filePath: String
  
  var info: js.UndefOr[js.Object] = js.undefined
  
  var minimize: Boolean
  
  var name: String
}
object CacheKey {
  
  inline def apply(cacheKey: String, filePath: String, minimize: Boolean, name: String): CacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], minimize = minimize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKey]
  }
  
  extension [Self <: CacheKey](x: Self) {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: js.Object): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
