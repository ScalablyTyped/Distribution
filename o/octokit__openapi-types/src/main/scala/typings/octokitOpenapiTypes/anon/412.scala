package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `412` extends StObject {
  
  /** @description Response */
  var `200`: Content383
}
object `412` {
  
  inline def apply(`200`: Content383): `412` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`412`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `412`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content383): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
