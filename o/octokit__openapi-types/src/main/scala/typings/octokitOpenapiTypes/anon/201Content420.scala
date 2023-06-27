package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content420` extends StObject {
  
  /** @description Response */
  var `201`: Content420
}
object `201Content420` {
  
  inline def apply(`201`: Content420): `201Content420` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content420`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content420`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content420): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
