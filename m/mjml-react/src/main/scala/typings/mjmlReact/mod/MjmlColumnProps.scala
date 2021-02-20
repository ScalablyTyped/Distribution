package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.VerticalAlignProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlColumnProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object MjmlColumnProps {
  
  @scala.inline
  def apply(): MjmlColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlColumnProps]
  }
  
  @scala.inline
  implicit class MjmlColumnPropsMutableBuilder[Self <: MjmlColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
