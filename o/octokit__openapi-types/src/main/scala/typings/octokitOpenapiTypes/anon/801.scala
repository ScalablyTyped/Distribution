package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `801` extends StObject {
  
  var path: MigrationidNumber
}
object `801` {
  
  inline def apply(path: MigrationidNumber): `801` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`801`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `801`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
