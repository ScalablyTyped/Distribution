package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `564` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ContenttypeCreatedat]
}
object `564` {
  
  inline def apply(applicationSlashjson: js.Array[ContenttypeCreatedat]): `564` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`564`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `564`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[ContenttypeCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ContenttypeCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
