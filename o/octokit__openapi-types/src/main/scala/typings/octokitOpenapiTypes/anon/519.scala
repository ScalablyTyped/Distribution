package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `519` extends StObject {
  
  var path: MigrationidOrg
}
object `519` {
  
  inline def apply(path: MigrationidOrg): `519` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`519`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `519`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
