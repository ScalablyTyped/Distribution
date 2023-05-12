package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameName extends StObject {
  
  var path: EnvironmentnameName
}
object PathEnvironmentnameName {
  
  inline def apply(path: EnvironmentnameName): PathEnvironmentnameName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameName] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameName): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
