package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: js.UndefOr[Margin] = js.undefined
  
  var left: js.UndefOr[Margin] = js.undefined
  
  var right: js.UndefOr[Margin] = js.undefined
  
  var top: js.UndefOr[Margin] = js.undefined
}
object Bottom {
  
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Margin): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Margin): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Margin): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Margin): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
