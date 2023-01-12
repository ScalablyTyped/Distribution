package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumberQuery407 extends StObject {
  
  var path: MigrationidNumber
  
  var query: `407`
}
object PathMigrationidNumberQuery407 {
  
  inline def apply(path: MigrationidNumber, query: `407`): PathMigrationidNumberQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumberQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumberQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
