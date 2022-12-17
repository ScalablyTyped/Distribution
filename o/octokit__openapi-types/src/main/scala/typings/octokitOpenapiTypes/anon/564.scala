package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `564` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CreatedatEnabled]
}
object `564` {
  
  inline def apply(applicationSlashjson: js.Array[CreatedatEnabled]): `564` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`564`]
  }
  
  extension [Self <: `564`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[CreatedatEnabled]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CreatedatEnabled*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
