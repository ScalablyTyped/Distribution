package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTagprotectionid extends StObject {
  
  var path: Tagprotectionid
}
object PathTagprotectionid {
  
  inline def apply(path: Tagprotectionid): PathTagprotectionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTagprotectionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTagprotectionid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Tagprotectionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
