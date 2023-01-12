package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[String]
}
object `12` {
  
  inline def apply(applicationSlashjson: StringDictionary[String]): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: StringDictionary[String]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
