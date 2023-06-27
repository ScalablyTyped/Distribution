package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberQuery extends StObject {
  
  var path: ProjectidNumber
  
  var query: js.UndefOr[AffiliationPagePerpage] = js.undefined
}
object PathProjectidNumberQuery {
  
  inline def apply(path: ProjectidNumber): PathProjectidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProjectidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AffiliationPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
