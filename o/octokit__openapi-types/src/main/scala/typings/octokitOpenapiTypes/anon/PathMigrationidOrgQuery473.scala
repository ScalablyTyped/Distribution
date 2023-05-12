package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidOrgQuery473 extends StObject {
  
  var path: MigrationidOrg
  
  var query: `473`
}
object PathMigrationidOrgQuery473 {
  
  inline def apply(path: MigrationidOrg, query: `473`): PathMigrationidOrgQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidOrgQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidOrgQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
