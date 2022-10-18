package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  /** Response */
  var `200`: Content203
}
object `221` {
  
  inline def apply(`200`: Content203): `221` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`221`]
  }
  
  extension [Self <: `221`](x: Self) {
    
    inline def set200(value: Content203): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
