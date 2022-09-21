package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumber extends StObject {
  
  var path: Issuenumber
}
object PathIssuenumber {
  
  inline def apply(path: Issuenumber): PathIssuenumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumber]
  }
  
  extension [Self <: PathIssuenumber](x: Self) {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
