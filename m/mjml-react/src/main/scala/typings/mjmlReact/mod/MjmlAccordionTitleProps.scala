package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.ColorProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlAccordionTitleProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var color: js.UndefOr[ColorProperty] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String | Double] = js.undefined
}
object MjmlAccordionTitleProps {
  
  @scala.inline
  def apply(): MjmlAccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionTitleProps]
  }
  
  @scala.inline
  implicit class MjmlAccordionTitlePropsMutableBuilder[Self <: MjmlAccordionTitleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
