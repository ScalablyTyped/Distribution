package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameNameRepositoryid extends StObject {
  
  var path: EnvironmentnameNameRepositoryid
}
object PathEnvironmentnameNameRepositoryid {
  
  inline def apply(path: EnvironmentnameNameRepositoryid): PathEnvironmentnameNameRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameNameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameNameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameNameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
