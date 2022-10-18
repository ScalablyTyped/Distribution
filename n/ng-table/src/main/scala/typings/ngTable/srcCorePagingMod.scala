package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCorePagingMod {
  
  trait IPageButton extends StObject {
    
    var active: Boolean
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object IPageButton {
    
    inline def apply(active: Boolean, `type`: String): IPageButton = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageButton]
    }
    
    extension [Self <: IPageButton](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
