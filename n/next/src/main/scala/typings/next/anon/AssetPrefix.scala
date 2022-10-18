package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPrefix extends StObject {
  
  var assetPrefix: String
}
object AssetPrefix {
  
  inline def apply(assetPrefix: String): AssetPrefix = {
    val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPrefix]
  }
  
  extension [Self <: AssetPrefix](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
  }
}
