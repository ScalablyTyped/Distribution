package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrgQuery250 extends StObject {
  
  var path: MigrationidOrg
  
  var query: `250`
}
object PathMigrationidOrgQuery250 {
  
  inline def apply(path: MigrationidOrg, query: `250`): PathMigrationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrgQuery250]
  }
  
  extension [Self <: PathMigrationidOrgQuery250](x: Self) {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
