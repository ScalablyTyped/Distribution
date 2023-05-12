package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content155` extends StObject {
  
  /** @description Response */
  var `200`: Content155
}
object `200Content155` {
  
  inline def apply(`200`: Content155): `200Content155` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content155`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content155): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
