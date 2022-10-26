package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasAppDir extends StObject {
  
  var assetPrefix: String
  
  var hasAppDir: Boolean
  
  var isDevelopment: Boolean
}
object HasAppDir {
  
  inline def apply(assetPrefix: String, hasAppDir: Boolean, isDevelopment: Boolean): HasAppDir = {
    val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], hasAppDir = hasAppDir.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasAppDir]
  }
  
  extension [Self <: HasAppDir](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setHasAppDir(value: Boolean): Self = StObject.set(x, "hasAppDir", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
  }
}
