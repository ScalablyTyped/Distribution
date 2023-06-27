package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `634` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ColumnsurlCreatedat]
}
object `634` {
  
  inline def apply(applicationSlashjson: js.Array[ColumnsurlCreatedat]): `634` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `634`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[ColumnsurlCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ColumnsurlCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
