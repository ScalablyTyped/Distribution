package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationid extends StObject {
  
  var path: Migrationid
  
  var query: js.UndefOr[`110`] = js.undefined
}
object PathMigrationid {
  
  inline def apply(path: Migrationid): PathMigrationid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Migrationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `110`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
