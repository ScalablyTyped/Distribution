package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseName extends StObject {
  
  var path: EnterpriseName
}
object PathEnterpriseName {
  
  inline def apply(path: EnterpriseName): PathEnterpriseName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterpriseName] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseName): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
