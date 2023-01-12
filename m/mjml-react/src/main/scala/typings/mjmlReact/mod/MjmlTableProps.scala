package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.Color
import typings.mjmlReact.mjmlReactStrings.auto
import typings.mjmlReact.mjmlReactStrings.center
import typings.mjmlReact.mjmlReactStrings.fixed
import typings.mjmlReact.mjmlReactStrings.inherit
import typings.mjmlReact.mjmlReactStrings.initial
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.none
import typings.mjmlReact.mjmlReactStrings.presentation
import typings.mjmlReact.mjmlReactStrings.right
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlTableProps extends StObject {
  
  var align: js.UndefOr[left | right | center] = js.undefined
  
  var border: js.UndefOr[Border[String | Double]] = js.undefined
  
  var cellpadding: js.UndefOr[String] = js.undefined
  
  var cellspacing: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String | Double] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  
  var role: js.UndefOr[presentation | none] = js.undefined
  
  var tableLayout: js.UndefOr[auto | fixed | initial | inherit] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlTableProps {
  
  inline def apply(): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlTableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlTableProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBorder(value: Border[String | Double]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCellpadding(value: String): Self = StObject.set(x, "cellpadding", value.asInstanceOf[js.Any])
    
    inline def setCellpaddingUndefined: Self = StObject.set(x, "cellpadding", js.undefined)
    
    inline def setCellspacing(value: String): Self = StObject.set(x, "cellspacing", value.asInstanceOf[js.Any])
    
    inline def setCellspacingUndefined: Self = StObject.set(x, "cellspacing", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setRole(value: presentation | none): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTableLayout(value: auto | fixed | initial | inherit): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    
    inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
