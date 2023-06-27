package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content386` extends StObject {
  
  /** @description Response for successful upload */
  var `201`: Content386
}
object `201Content386` {
  
  inline def apply(`201`: Content386): `201Content386` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content386`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content386`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content386): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
