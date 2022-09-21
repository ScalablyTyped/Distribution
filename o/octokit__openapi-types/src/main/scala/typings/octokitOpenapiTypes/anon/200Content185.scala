package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content185` extends StObject {
  
  /** Response when the suite already exists */
  var `200`: Content185
  
  /** Response when the suite was created */
  var `201`: Content185
}
object `200Content185` {
  
  inline def apply(`200`: Content185, `201`: Content185): `200Content185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content185`]
  }
  
  extension [Self <: `200Content185`](x: Self) {
    
    inline def set200(value: Content185): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content185): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
