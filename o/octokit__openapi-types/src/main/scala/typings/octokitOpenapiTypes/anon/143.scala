package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  /** @description Response */
  var `200`: Content90
}
object `143` {
  
  inline def apply(`200`: Content90): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content90): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
