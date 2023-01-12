package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `539` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Double]
}
object `539` {
  
  inline def apply(applicationSlashjson: StringDictionary[Double]): `539` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`539`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `539`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: StringDictionary[Double]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
