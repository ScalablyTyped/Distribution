package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumberQueryPage extends StObject {
  
  var path: MigrationidNumber
  
  var query: Page
}
object PathMigrationidNumberQueryPage {
  
  inline def apply(path: MigrationidNumber, query: Page): PathMigrationidNumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumberQueryPage]
  }
  
  extension [Self <: PathMigrationidNumberQueryPage](x: Self) {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
