package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssetidOwner extends StObject {
  
  var path: AssetidOwner
}
object PathAssetidOwner {
  
  inline def apply(path: AssetidOwner): PathAssetidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssetidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAssetidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AssetidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
