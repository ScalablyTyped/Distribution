package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.ColorProperty
import typings.mjmlReact.mjmlReactStrings.auto
import typings.mjmlReact.mjmlReactStrings.center
import typings.mjmlReact.mjmlReactStrings.fixed
import typings.mjmlReact.mjmlReactStrings.inherit
import typings.mjmlReact.mjmlReactStrings.initial
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlTableProps extends StObject {
  
  var align: js.UndefOr[left | right | center] = js.native
  
  var cellpadding: js.UndefOr[String] = js.native
  
  var cellspacing: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String | Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String | Double] = js.native
  
  var tableLayout: js.UndefOr[auto | fixed | initial | inherit] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object MjmlTableProps {
  
  @scala.inline
  def apply(): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlTableProps]
  }
  
  @scala.inline
  implicit class MjmlTablePropsMutableBuilder[Self <: MjmlTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCellpadding(value: String): Self = StObject.set(x, "cellpadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellpaddingUndefined: Self = StObject.set(x, "cellpadding", js.undefined)
    
    @scala.inline
    def setCellspacing(value: String): Self = StObject.set(x, "cellspacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellspacingUndefined: Self = StObject.set(x, "cellspacing", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setTableLayout(value: auto | fixed | initial | inherit): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
