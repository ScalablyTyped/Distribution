package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryid extends StObject {
  
  var path: Repositoryid
}
object PathRepositoryid {
  
  inline def apply(path: Repositoryid): PathRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryid]
  }
  
  extension [Self <: PathRepositoryid](x: Self) {
    
    inline def setPath(value: Repositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
