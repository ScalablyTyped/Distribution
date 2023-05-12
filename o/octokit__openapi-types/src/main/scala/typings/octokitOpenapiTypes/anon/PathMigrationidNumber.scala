package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumber extends StObject {
  
  var path: MigrationidNumber
  
  var query: `393`
}
object PathMigrationidNumber {
  
  inline def apply(path: MigrationidNumber, query: `393`): PathMigrationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `393`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
