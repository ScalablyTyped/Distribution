package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyboard extends StObject {
  
  var automaticScrollToTopOnHiding: Boolean
  
  def disableScrollingInShrinkView(disable: Boolean): Unit
  
  def hideFormAccessoryBar(hide: Boolean): Unit
  
  var isVisible: Boolean
  
  var onhide: js.Function
  
  var onhiding: js.Function
  
  var onshow: js.Function
  
  var onshowing: js.Function
  
  def shrinkView(shrink: Boolean): Unit
}
object Keyboard {
  
  inline def apply(
    automaticScrollToTopOnHiding: Boolean,
    disableScrollingInShrinkView: Boolean => Unit,
    hideFormAccessoryBar: Boolean => Unit,
    isVisible: Boolean,
    onhide: js.Function,
    onhiding: js.Function,
    onshow: js.Function,
    onshowing: js.Function,
    shrinkView: Boolean => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(automaticScrollToTopOnHiding = automaticScrollToTopOnHiding.asInstanceOf[js.Any], disableScrollingInShrinkView = js.Any.fromFunction1(disableScrollingInShrinkView), hideFormAccessoryBar = js.Any.fromFunction1(hideFormAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], onhide = onhide.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshow = onshow.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], shrinkView = js.Any.fromFunction1(shrinkView))
    __obj.asInstanceOf[Keyboard]
  }
  
  extension [Self <: Keyboard](x: Self) {
    
    inline def setAutomaticScrollToTopOnHiding(value: Boolean): Self = StObject.set(x, "automaticScrollToTopOnHiding", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollingInShrinkView(value: Boolean => Unit): Self = StObject.set(x, "disableScrollingInShrinkView", js.Any.fromFunction1(value))
    
    inline def setHideFormAccessoryBar(value: Boolean => Unit): Self = StObject.set(x, "hideFormAccessoryBar", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setOnhide(value: js.Function): Self = StObject.set(x, "onhide", value.asInstanceOf[js.Any])
    
    inline def setOnhiding(value: js.Function): Self = StObject.set(x, "onhiding", value.asInstanceOf[js.Any])
    
    inline def setOnshow(value: js.Function): Self = StObject.set(x, "onshow", value.asInstanceOf[js.Any])
    
    inline def setOnshowing(value: js.Function): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
    
    inline def setShrinkView(value: Boolean => Unit): Self = StObject.set(x, "shrinkView", js.Any.fromFunction1(value))
  }
}
