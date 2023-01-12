package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationid extends StObject {
  
  var path: Migrationid
  
  var query: `91`
}
object PathMigrationid {
  
  inline def apply(path: Migrationid, query: `91`): PathMigrationid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Migrationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `91`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
