package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumberQuery473 extends StObject {
  
  var path: MigrationidNumber
  
  var query: `473`
}
object PathMigrationidNumberQuery473 {
  
  inline def apply(path: MigrationidNumber, query: `473`): PathMigrationidNumberQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
