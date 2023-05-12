package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  /** @description Response */
  var `200`: Content140
}
object `167` {
  
  inline def apply(`200`: Content140): `167` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`167`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `167`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content140): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
