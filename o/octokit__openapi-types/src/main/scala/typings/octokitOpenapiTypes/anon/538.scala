package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `538` extends StObject {
  
  /** Response */
  var `200`: `537`
}
object `538` {
  
  inline def apply(`200`: `537`): `538` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`538`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `538`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `537`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
