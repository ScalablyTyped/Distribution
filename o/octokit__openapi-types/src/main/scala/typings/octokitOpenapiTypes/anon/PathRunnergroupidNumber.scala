package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidNumber extends StObject {
  
  var path: RunnergroupidNumber
}
object PathRunnergroupidNumber {
  
  inline def apply(path: RunnergroupidNumber): PathRunnergroupidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunnergroupidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RunnergroupidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
