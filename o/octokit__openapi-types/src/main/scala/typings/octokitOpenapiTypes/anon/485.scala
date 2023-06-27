package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `485` extends StObject {
  
  /** @description Response */
  var `200`: Content458
}
object `485` {
  
  inline def apply(`200`: Content458): `485` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`485`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `485`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content458): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
