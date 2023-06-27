package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson327 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `327`
}
object Applicationjson327 {
  
  inline def apply(applicationSlashjson: `327`): Applicationjson327 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson327]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson327] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `327`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
