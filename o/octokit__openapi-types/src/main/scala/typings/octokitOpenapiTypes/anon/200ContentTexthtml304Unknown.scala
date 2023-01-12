package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentTexthtml304Unknown` extends StObject {
  
  /** Response */
  var `200`: ContentTexthtml
  
  var `304`: Any
}
object `200ContentTexthtml304Unknown` {
  
  inline def apply(`200`: ContentTexthtml, `304`: Any): `200ContentTexthtml304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentTexthtml304Unknown`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentTexthtml304Unknown`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentTexthtml): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
