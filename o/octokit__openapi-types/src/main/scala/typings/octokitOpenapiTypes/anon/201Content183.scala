package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content183` extends StObject {
  
  /** @description Response */
  var `201`: Content183
}
object `201Content183` {
  
  inline def apply(`201`: Content183): `201Content183` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content183`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content183`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content183): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
