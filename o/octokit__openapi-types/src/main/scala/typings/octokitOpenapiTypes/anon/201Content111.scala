package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content111` extends StObject {
  
  /** Response */
  var `201`: Content111
}
object `201Content111` {
  
  inline def apply(`201`: Content111): `201Content111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content111`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content111): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
