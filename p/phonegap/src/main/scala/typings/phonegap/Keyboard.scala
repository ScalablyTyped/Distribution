package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyboard extends StObject {
  
  var automaticScrollToTopOnHiding: Boolean = js.native
  
  def disableScrollingInShrinkView(disable: Boolean): Unit = js.native
  
  def hideFormAccessoryBar(hide: Boolean): Unit = js.native
  
  var isVisible: Boolean = js.native
  
  var onhide: js.Function = js.native
  
  var onhiding: js.Function = js.native
  
  var onshow: js.Function = js.native
  
  var onshowing: js.Function = js.native
  
  def shrinkView(shrink: Boolean): Unit = js.native
}
object Keyboard {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class KeyboardMutableBuilder[Self <: Keyboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticScrollToTopOnHiding(value: Boolean): Self = StObject.set(x, "automaticScrollToTopOnHiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScrollingInShrinkView(value: Boolean => Unit): Self = StObject.set(x, "disableScrollingInShrinkView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideFormAccessoryBar(value: Boolean => Unit): Self = StObject.set(x, "hideFormAccessoryBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhide(value: js.Function): Self = StObject.set(x, "onhide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhiding(value: js.Function): Self = StObject.set(x, "onhiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshow(value: js.Function): Self = StObject.set(x, "onshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshowing(value: js.Function): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkView(value: Boolean => Unit): Self = StObject.set(x, "shrinkView", js.Any.fromFunction1(value))
  }
}
