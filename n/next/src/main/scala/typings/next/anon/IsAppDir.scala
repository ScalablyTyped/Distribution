package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAppDir extends StObject {
  
  var assetPrefix: String
  
  var isAppDir: Boolean
  
  var isDevelopment: Boolean
}
object IsAppDir {
  
  inline def apply(assetPrefix: String, isAppDir: Boolean, isDevelopment: Boolean): IsAppDir = {
    val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], isAppDir = isAppDir.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAppDir]
  }
  
  extension [Self <: IsAppDir](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsAppDir(value: Boolean): Self = StObject.set(x, "isAppDir", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
  }
}
