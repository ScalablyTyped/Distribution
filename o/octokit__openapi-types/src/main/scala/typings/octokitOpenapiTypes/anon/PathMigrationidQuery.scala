package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidQuery extends StObject {
  
  var path: Migrationid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathMigrationidQuery {
  
  inline def apply(path: Migrationid): PathMigrationidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Migrationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
