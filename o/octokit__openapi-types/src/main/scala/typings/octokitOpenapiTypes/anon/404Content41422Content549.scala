package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content41422Content549` extends StObject {
  
  var `404`: Content41
  
  var `422`: Content549
}
object `404Content41422Content549` {
  
  inline def apply(`404`: Content41, `422`: Content549): `404Content41422Content549` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content41422Content549`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404Content41422Content549`] (val x: Self) extends AnyVal {
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
