package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var path: Migrationid
}
object `51` {
  
  inline def apply(path: Migrationid): `51` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setPath(value: Migrationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
