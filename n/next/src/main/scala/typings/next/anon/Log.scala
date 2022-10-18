package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  var assetPrefix: String
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var path: String
  
  var timeout: Double
}
object Log {
  
  inline def apply(assetPrefix: String, path: String, timeout: Double): Log = {
    val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  extension [Self <: Log](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
