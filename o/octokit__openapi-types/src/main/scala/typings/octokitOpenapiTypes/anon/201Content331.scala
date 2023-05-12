package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content331` extends StObject {
  
  /** @description Response for successful upload */
  var `201`: Content331
}
object `201Content331` {
  
  inline def apply(`201`: Content331): `201Content331` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content331`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content331`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content331): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
