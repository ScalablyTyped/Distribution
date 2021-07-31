package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingMod {
  
  trait IPageButton extends StObject {
    
    var active: Boolean
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object IPageButton {
    
    @scala.inline
    def apply(active: Boolean, `type`: String): IPageButton = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageButton]
    }
    
    @scala.inline
    implicit class IPageButtonMutableBuilder[Self <: IPageButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
