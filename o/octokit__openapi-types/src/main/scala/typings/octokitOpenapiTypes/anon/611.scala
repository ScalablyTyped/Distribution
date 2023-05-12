package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `611` extends StObject {
  
  /** @description Response */
  var `200`: Content491
}
object `611` {
  
  inline def apply(`200`: Content491): `611` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`611`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `611`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content491): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
