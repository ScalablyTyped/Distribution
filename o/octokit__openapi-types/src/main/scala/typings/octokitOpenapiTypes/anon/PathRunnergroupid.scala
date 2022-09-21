package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupid extends StObject {
  
  var path: Runnergroupid
}
object PathRunnergroupid {
  
  inline def apply(path: Runnergroupid): PathRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupid]
  }
  
  extension [Self <: PathRunnergroupid](x: Self) {
    
    inline def setPath(value: Runnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
