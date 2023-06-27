package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumberQuery extends StObject {
  
  var path: MigrationidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathMigrationidNumberQuery {
  
  inline def apply(path: MigrationidNumber): PathMigrationidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
