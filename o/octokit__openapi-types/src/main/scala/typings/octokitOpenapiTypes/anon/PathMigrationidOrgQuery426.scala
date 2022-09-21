package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrgQuery426 extends StObject {
  
  var path: MigrationidOrg
  
  var query: `426`
}
object PathMigrationidOrgQuery426 {
  
  inline def apply(path: MigrationidOrg, query: `426`): PathMigrationidOrgQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrgQuery426]
  }
  
  extension [Self <: PathMigrationidOrgQuery426](x: Self) {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
