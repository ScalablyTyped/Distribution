package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content586` extends StObject {
  
  /** @description Response */
  var `200`: Content586
  
  var `404`: Content36
}
object `200Content586` {
  
  inline def apply(`200`: Content586, `404`: Content36): `200Content586` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content586`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content586`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content586): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
