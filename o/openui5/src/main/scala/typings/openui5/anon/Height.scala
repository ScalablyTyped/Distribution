package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  /**
    * The height of the dialog when closed
    */
  var height: js.UndefOr[int] = js.undefined
  
  /**
    * The left position of the dialog when closed
    */
  var left: js.UndefOr[int] = js.undefined
  
  /**
    * The top position of the dialog when closed
    */
  var top: js.UndefOr[int] = js.undefined
  
  /**
    * The width of the dialog when closed
    */
  var width: js.UndefOr[int] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: int): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: int): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: int): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: int): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
