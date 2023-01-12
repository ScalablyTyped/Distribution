package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `542` extends StObject {
  
  /** Response */
  var `200`: `541`
}
object `542` {
  
  inline def apply(`200`: `541`): `542` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`542`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `542`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `541`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
