package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOrgStringRepositoryidNumber extends StObject {
  
  var path: NameStringOrgStringRepositoryidNumber
}
object PathNameStringOrgStringRepositoryidNumber {
  
  inline def apply(path: NameStringOrgStringRepositoryidNumber): PathNameStringOrgStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOrgStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameStringOrgStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameStringOrgStringRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
