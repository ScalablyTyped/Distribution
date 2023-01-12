package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `450` extends StObject {
  
  var path: MigrationidOrg
}
object `450` {
  
  inline def apply(path: MigrationidOrg): `450` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`450`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `450`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
