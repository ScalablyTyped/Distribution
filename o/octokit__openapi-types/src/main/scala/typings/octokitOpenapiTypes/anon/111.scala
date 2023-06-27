package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var path: Migrationid
}
object `111` {
  
  inline def apply(path: Migrationid): `111` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Migrationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
