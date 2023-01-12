package typings.nprogress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<nprogress.nprogress.NProgressOptions> */
  trait PartialNProgressOptions extends StObject {
    
    var barSelector: js.UndefOr[String] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var parent: js.UndefOr[String] = js.undefined
    
    var positionUsing: js.UndefOr[String] = js.undefined
    
    var showSpinner: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var spinnerSelector: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var trickle: js.UndefOr[Boolean] = js.undefined
    
    var trickleSpeed: js.UndefOr[Double] = js.undefined
  }
  object PartialNProgressOptions {
    
    inline def apply(): PartialNProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNProgressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialNProgressOptions] (val x: Self) extends AnyVal {
      
      inline def setBarSelector(value: String): Self = StObject.set(x, "barSelector", value.asInstanceOf[js.Any])
      
      inline def setBarSelectorUndefined: Self = StObject.set(x, "barSelector", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPositionUsing(value: String): Self = StObject.set(x, "positionUsing", value.asInstanceOf[js.Any])
      
      inline def setPositionUsingUndefined: Self = StObject.set(x, "positionUsing", js.undefined)
      
      inline def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
      
      inline def setShowSpinnerUndefined: Self = StObject.set(x, "showSpinner", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpinnerSelector(value: String): Self = StObject.set(x, "spinnerSelector", value.asInstanceOf[js.Any])
      
      inline def setSpinnerSelectorUndefined: Self = StObject.set(x, "spinnerSelector", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      inline def setTrickleSpeed(value: Double): Self = StObject.set(x, "trickleSpeed", value.asInstanceOf[js.Any])
      
      inline def setTrickleSpeedUndefined: Self = StObject.set(x, "trickleSpeed", js.undefined)
      
      inline def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
    }
  }
}
