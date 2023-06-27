package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `733` extends StObject {
  
  /** @description Response */
  var `200`: Content719
}
object `733` {
  
  inline def apply(`200`: Content719): `733` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`733`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `733`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content719): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
