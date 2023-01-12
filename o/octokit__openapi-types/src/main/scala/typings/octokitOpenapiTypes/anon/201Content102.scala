package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content102` extends StObject {
  
  /** Response */
  var `201`: Content102
}
object `201Content102` {
  
  inline def apply(`201`: Content102): `201Content102` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content102`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content102`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content102): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
