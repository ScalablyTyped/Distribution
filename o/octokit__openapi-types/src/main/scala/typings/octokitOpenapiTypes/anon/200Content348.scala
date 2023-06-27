package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content348` extends StObject {
  
  /** @description The branch has been successfully synced with the upstream repository */
  var `200`: Content348
}
object `200Content348` {
  
  inline def apply(`200`: Content348): `200Content348` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content348`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content348`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content348): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
