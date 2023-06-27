package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content140` extends StObject {
  
  /** @description Response */
  var `200`: Content140
  
  /** @description Response */
  var `201`: Content140
}
object `200Content140` {
  
  inline def apply(`200`: Content140, `201`: Content140): `200Content140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content140`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content140`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content140): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content140): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
