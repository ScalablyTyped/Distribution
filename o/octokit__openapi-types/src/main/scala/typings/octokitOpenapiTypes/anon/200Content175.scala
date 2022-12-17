package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content175` extends StObject {
  
  /** Response when the suite already exists */
  var `200`: Content175
  
  /** Response when the suite was created */
  var `201`: Content175
}
object `200Content175` {
  
  inline def apply(`200`: Content175, `201`: Content175): `200Content175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content175`]
  }
  
  extension [Self <: `200Content175`](x: Self) {
    
    inline def set200(value: Content175): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content175): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
