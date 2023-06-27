package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson777 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `777`
}
object Applicationjson777 {
  
  inline def apply(applicationSlashjson: `777`): Applicationjson777 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson777]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson777] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `777`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
