package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumber extends StObject {
  
  var path: MigrationidNumber
  
  var query: `214`
}
object PathMigrationidNumber {
  
  inline def apply(path: MigrationidNumber, query: `214`): PathMigrationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumber]
  }
  
  extension [Self <: PathMigrationidNumber](x: Self) {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `214`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
