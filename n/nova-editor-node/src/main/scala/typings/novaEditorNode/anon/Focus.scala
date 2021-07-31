package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var reveal: js.UndefOr[Double] = js.undefined
  
  var select: js.UndefOr[Boolean] = js.undefined
}
object Focus {
  
  @scala.inline
  def apply(): Focus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setReveal(value: Double): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
