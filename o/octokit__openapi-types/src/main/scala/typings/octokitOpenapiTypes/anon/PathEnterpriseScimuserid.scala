package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseScimuserid extends StObject {
  
  var path: EnterpriseScimuserid
}
object PathEnterpriseScimuserid {
  
  inline def apply(path: EnterpriseScimuserid): PathEnterpriseScimuserid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseScimuserid]
  }
  
  extension [Self <: PathEnterpriseScimuserid](x: Self) {
    
    inline def setPath(value: EnterpriseScimuserid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
