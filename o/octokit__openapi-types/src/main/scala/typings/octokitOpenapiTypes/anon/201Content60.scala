package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content60` extends StObject {
  
  /** Response when creating a secret */
  var `201`: Content60
}
object `201Content60` {
  
  inline def apply(`201`: Content60): `201Content60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content60`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content60`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content60): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
