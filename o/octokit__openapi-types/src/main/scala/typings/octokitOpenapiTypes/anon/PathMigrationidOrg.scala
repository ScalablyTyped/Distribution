package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrg extends StObject {
  
  var path: MigrationidOrg
  
  var query: `95`
}
object PathMigrationidOrg {
  
  inline def apply(path: MigrationidOrg, query: `95`): PathMigrationidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidOrg] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `95`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
