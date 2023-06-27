package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `492` extends StObject {
  
  /** @description Response */
  var `200`: Content476
}
object `492` {
  
  inline def apply(`200`: Content476): `492` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`492`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `492`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content476): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
