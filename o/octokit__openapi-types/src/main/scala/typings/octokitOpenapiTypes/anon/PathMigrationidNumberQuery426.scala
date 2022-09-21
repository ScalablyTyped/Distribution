package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumberQuery426 extends StObject {
  
  var path: MigrationidNumber
  
  var query: `426`
}
object PathMigrationidNumberQuery426 {
  
  inline def apply(path: MigrationidNumber, query: `426`): PathMigrationidNumberQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumberQuery426]
  }
  
  extension [Self <: PathMigrationidNumberQuery426](x: Self) {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
