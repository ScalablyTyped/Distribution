package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumber extends StObject {
  
  var path: MigrationidNumber
  
  var query: `372`
}
object PathMigrationidNumber {
  
  inline def apply(path: MigrationidNumber, query: `372`): PathMigrationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `372`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
