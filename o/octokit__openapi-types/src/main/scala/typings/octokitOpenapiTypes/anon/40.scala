package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Any]
}
object `40` {
  
  inline def apply(applicationSlashjson: StringDictionary[Any]): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: StringDictionary[Any]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
