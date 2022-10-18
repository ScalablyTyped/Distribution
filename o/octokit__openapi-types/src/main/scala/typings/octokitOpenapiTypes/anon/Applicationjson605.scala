package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson605 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `605`
}
object Applicationjson605 {
  
  inline def apply(applicationSlashjson: `605`): Applicationjson605 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson605]
  }
  
  extension [Self <: Applicationjson605](x: Self) {
    
    inline def setApplicationSlashjson(value: `605`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
