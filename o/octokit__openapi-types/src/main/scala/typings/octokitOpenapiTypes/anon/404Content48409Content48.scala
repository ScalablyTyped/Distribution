package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content48409Content48` extends StObject {
  
  var `404`: Content48
  
  var `409`: Content48
  
  var `422`: Content397
}
object `404Content48409Content48` {
  
  inline def apply(`404`: Content48, `409`: Content48, `422`: Content397): `404Content48409Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content48409Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404Content48409Content48`] (val x: Self) extends AnyVal {
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
