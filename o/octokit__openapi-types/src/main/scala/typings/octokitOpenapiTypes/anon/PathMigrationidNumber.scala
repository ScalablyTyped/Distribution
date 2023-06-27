package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMigrationidNumber extends StObject {
  
  var path: MigrationidNumber
  
  var query: js.UndefOr[`469`] = js.undefined
}
object PathMigrationidNumber {
  
  inline def apply(path: MigrationidNumber): PathMigrationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMigrationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMigrationidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `469`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
