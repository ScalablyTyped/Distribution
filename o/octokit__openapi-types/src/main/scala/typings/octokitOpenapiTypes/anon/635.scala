package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `635` extends StObject {
  
  /** @description if child teams exist */
  var `200`: Content603
}
object `635` {
  
  inline def apply(`200`: Content603): `635` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`635`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `635`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content603): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
