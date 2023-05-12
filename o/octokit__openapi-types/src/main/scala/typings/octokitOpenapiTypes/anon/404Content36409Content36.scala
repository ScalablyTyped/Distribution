package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content36409Content36` extends StObject {
  
  var `404`: Content36
  
  var `409`: Content36
  
  var `422`: Content346
}
object `404Content36409Content36` {
  
  inline def apply(`404`: Content36, `409`: Content36, `422`: Content346): `404Content36409Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content36409Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404Content36409Content36`] (val x: Self) extends AnyVal {
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content36): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
