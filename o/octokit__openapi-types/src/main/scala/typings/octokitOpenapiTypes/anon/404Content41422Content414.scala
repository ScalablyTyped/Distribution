package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content41422Content414` extends StObject {
  
  var `404`: Content41
  
  var `422`: Content414
}
object `404Content41422Content414` {
  
  inline def apply(`404`: Content41, `422`: Content414): `404Content41422Content414` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content41422Content414`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404Content41422Content414`] (val x: Self) extends AnyVal {
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
