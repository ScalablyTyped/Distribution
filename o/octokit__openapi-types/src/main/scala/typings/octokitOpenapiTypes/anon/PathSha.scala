package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSha extends StObject {
  
  var path: Sha
}
object PathSha {
  
  inline def apply(path: Sha): PathSha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Sha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
