package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrg extends StObject {
  
  var path: MigrationidOrg
  
  var query: js.UndefOr[`110`] = js.undefined
}
object PathMigrationidOrg {
  
  inline def apply(path: MigrationidOrg): PathMigrationidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidOrg] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `110`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
