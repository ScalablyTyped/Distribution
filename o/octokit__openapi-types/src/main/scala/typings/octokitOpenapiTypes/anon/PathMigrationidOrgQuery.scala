package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrgQuery extends StObject {
  
  var path: MigrationidOrg
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathMigrationidOrgQuery {
  
  inline def apply(path: MigrationidOrg): PathMigrationidOrgQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
