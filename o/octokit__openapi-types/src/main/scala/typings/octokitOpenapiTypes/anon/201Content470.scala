package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content470` extends StObject {
  
  /** @description Response */
  var `201`: Content470
  
  var `404`: Content36
  
  var `422`: Content471
}
object `201Content470` {
  
  inline def apply(`201`: Content470, `404`: Content36, `422`: Content471): `201Content470` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content470`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content470`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content470): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content471): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
