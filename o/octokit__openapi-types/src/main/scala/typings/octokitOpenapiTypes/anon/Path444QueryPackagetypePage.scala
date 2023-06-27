package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path444QueryPackagetypePage extends StObject {
  
  var path: `444`
  
  var query: PackagetypePage
}
object Path444QueryPackagetypePage {
  
  inline def apply(path: `444`, query: PackagetypePage): Path444QueryPackagetypePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path444QueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path444QueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `444`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
