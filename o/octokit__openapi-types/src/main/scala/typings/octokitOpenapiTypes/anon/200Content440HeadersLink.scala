package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content440HeadersLink` extends StObject {
  
  /** Response */
  var `200`: Content440HeadersLink
  
  var `304`: Any
}
object `200Content440HeadersLink` {
  
  inline def apply(`200`: Content440HeadersLink, `304`: Any): `200Content440HeadersLink` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content440HeadersLink`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content440HeadersLink`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content440HeadersLink): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
