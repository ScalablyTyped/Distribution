package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.BorderStyleProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlDividerProps extends StObject {
  
  var borderColor: js.UndefOr[BorderColorProperty] = js.undefined
  
  var borderStyle: js.UndefOr[BorderStyleProperty] = js.undefined
  
  var borderWidth: js.UndefOr[String | Double] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlDividerProps {
  
  @scala.inline
  def apply(): MjmlDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlDividerProps]
  }
  
  @scala.inline
  implicit class MjmlDividerPropsMutableBuilder[Self <: MjmlDividerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: BorderColorProperty): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: BorderStyleProperty): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: String | Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
