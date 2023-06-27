package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[js.UndefOr[String]]
}
object `15` {
  
  inline def apply(applicationSlashjson: StringDictionary[js.UndefOr[String]]): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
