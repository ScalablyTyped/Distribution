package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorName extends StObject {
  
  var color: String | Null
  
  var name: String | Null
}
object ColorName {
  
  inline def apply(): ColorName = {
    val __obj = js.Dynamic.literal(color = null, name = null)
    __obj.asInstanceOf[ColorName]
  }
  
  extension [Self <: ColorName](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
