package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `283` extends StObject {
  
  /** Response */
  var `200`: `282`
}
object `283` {
  
  inline def apply(`200`: `282`): `283` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`283`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `283`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `282`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
