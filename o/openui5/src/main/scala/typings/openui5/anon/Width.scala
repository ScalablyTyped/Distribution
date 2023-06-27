package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var height: float
  
  var width: float
}
object Width {
  
  inline def apply(height: float, width: float): Width = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: float): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: float): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
