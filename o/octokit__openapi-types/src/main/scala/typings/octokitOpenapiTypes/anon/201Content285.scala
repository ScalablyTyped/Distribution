package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content285` extends StObject {
  
  /** @description The enabled custom deployment protection rule */
  var `201`: Content285
}
object `201Content285` {
  
  inline def apply(`201`: Content285): `201Content285` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content285`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content285`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content285): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
