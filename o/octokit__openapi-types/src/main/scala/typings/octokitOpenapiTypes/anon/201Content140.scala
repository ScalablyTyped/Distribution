package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content140` extends StObject {
  
  /** @description Response */
  var `201`: Content140
}
object `201Content140` {
  
  inline def apply(`201`: Content140): `201Content140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content140`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content140`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content140): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
