package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `745` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodytextCommitid]
}
object `745` {
  
  inline def apply(applicationSlashjson: js.Array[BodytextCommitid]): `745` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`745`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `745`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodytextCommitid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodytextCommitid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
