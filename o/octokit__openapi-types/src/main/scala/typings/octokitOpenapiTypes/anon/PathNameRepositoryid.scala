package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameRepositoryid extends StObject {
  
  var path: NameRepositoryid
}
object PathNameRepositoryid {
  
  inline def apply(path: NameRepositoryid): PathNameRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
