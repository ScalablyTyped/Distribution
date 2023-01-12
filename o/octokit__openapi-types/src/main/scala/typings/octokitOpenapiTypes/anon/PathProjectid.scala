package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectid extends StObject {
  
  var path: Projectid
}
object PathProjectid {
  
  inline def apply(path: Projectid): PathProjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProjectid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Projectid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
