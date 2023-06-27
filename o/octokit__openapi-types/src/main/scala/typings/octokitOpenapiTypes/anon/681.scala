package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `681` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CreatedatDiffurl]
}
object `681` {
  
  inline def apply(applicationSlashjson: js.Array[CreatedatDiffurl]): `681` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`681`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `681`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[CreatedatDiffurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CreatedatDiffurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
