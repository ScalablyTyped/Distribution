package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumber extends StObject {
  
  var path: Commentnumber
}
object PathCommentnumber {
  
  inline def apply(path: Commentnumber): PathCommentnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumber]
  }
  
  extension [Self <: PathCommentnumber](x: Self) {
    
    inline def setPath(value: Commentnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
