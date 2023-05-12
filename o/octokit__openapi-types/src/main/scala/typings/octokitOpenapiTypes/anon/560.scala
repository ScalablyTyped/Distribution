package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `560` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRunsrerequestable
}
object `560` {
  
  inline def apply(`200`: ContentApplicationjsonRunsrerequestable): `560` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`560`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `560`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRunsrerequestable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
