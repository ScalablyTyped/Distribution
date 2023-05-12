package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatidNumber extends StObject {
  
  var path: PatidNumber
}
object PathPatidNumber {
  
  inline def apply(path: PatidNumber): PathPatidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PatidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
