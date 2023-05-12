package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path370QueryPackagetypePage extends StObject {
  
  var path: `370`
  
  var query: PackagetypePage
}
object Path370QueryPackagetypePage {
  
  inline def apply(path: `370`, query: PackagetypePage): Path370QueryPackagetypePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path370QueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path370QueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `370`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
