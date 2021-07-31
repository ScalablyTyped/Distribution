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
    
    @scala.inline
    def apply(): PartialNProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNProgressOptions]
    }
    
    @scala.inline
    implicit class PartialNProgressOptionsMutableBuilder[Self <: PartialNProgressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarSelector(value: String): Self = StObject.set(x, "barSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarSelectorUndefined: Self = StObject.set(x, "barSelector", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPositionUsing(value: String): Self = StObject.set(x, "positionUsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUsingUndefined: Self = StObject.set(x, "positionUsing", js.undefined)
      
      @scala.inline
      def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSpinnerUndefined: Self = StObject.set(x, "showSpinner", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setSpinnerSelector(value: String): Self = StObject.set(x, "spinnerSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerSelectorUndefined: Self = StObject.set(x, "spinnerSelector", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleSpeed(value: Double): Self = StObject.set(x, "trickleSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleSpeedUndefined: Self = StObject.set(x, "trickleSpeed", js.undefined)
      
      @scala.inline
      def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
    }
  }
}
