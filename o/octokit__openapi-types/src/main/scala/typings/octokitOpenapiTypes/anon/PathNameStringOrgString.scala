package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOrgString extends StObject {
  
  var path: NameStringOrgString
}
object PathNameStringOrgString {
  
  inline def apply(path: NameStringOrgString): PathNameStringOrgString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOrgString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameStringOrgString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameStringOrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
