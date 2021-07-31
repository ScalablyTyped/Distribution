package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.VerticalAlignProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlWrapperProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.undefined
  
  var backgroundUrl: js.UndefOr[String] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var textAlign: js.UndefOr[TextAlignProperty] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
}
object MjmlWrapperProps {
  
  @scala.inline
  def apply(): MjmlWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlWrapperProps]
  }
  
  @scala.inline
  implicit class MjmlWrapperPropsMutableBuilder[Self <: MjmlWrapperProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundRepeat(value: BackgroundRepeatProperty): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSize(value: BackgroundSizeProperty[String | Double]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundUrl(value: String): Self = StObject.set(x, "backgroundUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUrlUndefined: Self = StObject.set(x, "backgroundUrl", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlignProperty): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
