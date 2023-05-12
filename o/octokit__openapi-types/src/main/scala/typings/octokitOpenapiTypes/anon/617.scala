package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `617` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodytextCommitid]
}
object `617` {
  
  inline def apply(applicationSlashjson: js.Array[BodytextCommitid]): `617` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`617`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `617`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodytextCommitid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodytextCommitid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
