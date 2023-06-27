package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberQuery extends StObject {
  
  var path: Attemptnumber
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathAttemptnumberQuery {
  
  inline def apply(path: Attemptnumber): PathAttemptnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttemptnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Attemptnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
