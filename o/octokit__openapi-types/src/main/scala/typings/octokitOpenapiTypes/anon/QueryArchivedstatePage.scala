package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArchivedstatePage extends StObject {
  
  var path: ColumnidNumber
  
  var query: ArchivedstatePage
}
object QueryArchivedstatePage {
  
  inline def apply(path: ColumnidNumber, query: ArchivedstatePage): QueryArchivedstatePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArchivedstatePage]
  }
  
  extension [Self <: QueryArchivedstatePage](x: Self) {
    
    inline def setPath(value: ColumnidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ArchivedstatePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
