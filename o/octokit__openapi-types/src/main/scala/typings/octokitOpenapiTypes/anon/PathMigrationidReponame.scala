package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidReponame extends StObject {
  
  var path: MigrationidReponame
}
object PathMigrationidReponame {
  
  inline def apply(path: MigrationidReponame): PathMigrationidReponame = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidReponame]
  }
  
  extension [Self <: PathMigrationidReponame](x: Self) {
    
    inline def setPath(value: MigrationidReponame): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
