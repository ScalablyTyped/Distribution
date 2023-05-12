package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content242` extends StObject {
  
  /** @description The enabled custom deployment protection rule */
  var `201`: Content242
}
object `201Content242` {
  
  inline def apply(`201`: Content242): `201Content242` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content242`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content242`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content242): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
