package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssetid extends StObject {
  
  var path: Assetid
}
object PathAssetid {
  
  inline def apply(path: Assetid): PathAssetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssetid]
  }
  
  extension [Self <: PathAssetid](x: Self) {
    
    inline def setPath(value: Assetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
