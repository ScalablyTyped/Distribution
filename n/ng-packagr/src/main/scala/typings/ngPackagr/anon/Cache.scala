package typings.ngPackagr.anon

import typings.rollup.mod.RollupCache
import typings.rollup.mod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var cache: RollupCache
  
  var code: String
  
  var map: SourceMap
}
object Cache {
  
  inline def apply(cache: RollupCache, code: String, map: SourceMap): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  
  extension [Self <: Cache](x: Self) {
    
    inline def setCache(value: RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
