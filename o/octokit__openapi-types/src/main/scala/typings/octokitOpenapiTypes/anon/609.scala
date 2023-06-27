package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `609` extends StObject {
  
  var path: MigrationidOrg
}
object `609` {
  
  inline def apply(path: MigrationidOrg): `609` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`609`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `609`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
