package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Unknown` extends StObject {
  
  /** The action could not be taken due to an in progress enablement, or a policy is preventing enablement */
  var `422`: Any
}
object `422Unknown` {
  
  inline def apply(`422`: Any): `422Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Unknown`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422Unknown`] (val x: Self) extends AnyVal {
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
