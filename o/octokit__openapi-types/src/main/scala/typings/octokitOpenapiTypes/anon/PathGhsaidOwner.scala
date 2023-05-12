package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGhsaidOwner extends StObject {
  
  var path: GhsaidOwner
}
object PathGhsaidOwner {
  
  inline def apply(path: GhsaidOwner): PathGhsaidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGhsaidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGhsaidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: GhsaidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
