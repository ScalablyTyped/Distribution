package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `736` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommitCreatedat]
}
object `736` {
  
  inline def apply(applicationSlashjson: js.Array[CommitCreatedat]): `736` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`736`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `736`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[CommitCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommitCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
