package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content684` extends StObject {
  
  /** @description Response */
  var `200`: Content684
  
  var `301`: Content41
}
object `200Content684` {
  
  inline def apply(`200`: Content684, `301`: Content41): `200Content684` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content684`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content684`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content684): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content41): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
