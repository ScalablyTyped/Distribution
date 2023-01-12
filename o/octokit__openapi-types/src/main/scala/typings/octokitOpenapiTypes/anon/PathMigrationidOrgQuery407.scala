package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrgQuery407 extends StObject {
  
  var path: MigrationidOrg
  
  var query: `407`
}
object PathMigrationidOrgQuery407 {
  
  inline def apply(path: MigrationidOrg, query: `407`): PathMigrationidOrgQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrgQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidOrgQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
