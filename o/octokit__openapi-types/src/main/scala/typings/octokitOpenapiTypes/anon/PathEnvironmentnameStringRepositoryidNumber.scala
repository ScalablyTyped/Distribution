package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameStringRepositoryidNumber extends StObject {
  
  var path: EnvironmentnameStringRepositoryidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathEnvironmentnameStringRepositoryidNumber {
  
  inline def apply(path: EnvironmentnameStringRepositoryidNumber): PathEnvironmentnameStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameStringRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
