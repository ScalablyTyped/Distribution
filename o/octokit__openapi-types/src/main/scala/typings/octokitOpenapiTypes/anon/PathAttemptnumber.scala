package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumber extends StObject {
  
  var path: Attemptnumber
  
  var query: js.UndefOr[Excludepullrequests] = js.undefined
}
object PathAttemptnumber {
  
  inline def apply(path: Attemptnumber): PathAttemptnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttemptnumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Attemptnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Excludepullrequests): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
