package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `453` extends StObject {
  
  /** Response */
  var `200`: Content440Headers
}
object `453` {
  
  inline def apply(`200`: Content440Headers): `453` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`453`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `453`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content440Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
