package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAutolinkidOwner extends StObject {
  
  var path: AutolinkidOwner
}
object PathAutolinkidOwner {
  
  inline def apply(path: AutolinkidOwner): PathAutolinkidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAutolinkidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAutolinkidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AutolinkidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
