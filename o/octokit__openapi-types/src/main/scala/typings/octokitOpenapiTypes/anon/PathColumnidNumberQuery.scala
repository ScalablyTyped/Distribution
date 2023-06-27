package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathColumnidNumberQuery extends StObject {
  
  var path: ColumnidNumber
  
  var query: js.UndefOr[ArchivedstatePage] = js.undefined
}
object PathColumnidNumberQuery {
  
  inline def apply(path: ColumnidNumber): PathColumnidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathColumnidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathColumnidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ColumnidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ArchivedstatePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
