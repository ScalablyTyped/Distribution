package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `817` extends StObject {
  
  /** @description Response */
  var `200`: Content805
}
object `817` {
  
  inline def apply(`200`: Content805): `817` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`817`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `817`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content805): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
