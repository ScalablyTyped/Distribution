package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathScimuserid extends StObject {
  
  var path: Scimuserid
}
object PathScimuserid {
  
  inline def apply(path: Scimuserid): PathScimuserid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathScimuserid]
  }
  
  extension [Self <: PathScimuserid](x: Self) {
    
    inline def setPath(value: Scimuserid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
