package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `785` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Businessplus | Blog
}
object `785` {
  
  inline def apply(applicationSlashjson: Businessplus | Blog): `785` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`785`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `785`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Businessplus | Blog): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
