package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content590` extends StObject {
  
  /** @description Response */
  var `200`: Content590
  
  var `404`: Content36
  
  var `503`: Content36
}
object `200Content590` {
  
  inline def apply(`200`: Content590, `404`: Content36, `503`: Content36): `200Content590` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content590`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content590`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content590): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: Content36): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
