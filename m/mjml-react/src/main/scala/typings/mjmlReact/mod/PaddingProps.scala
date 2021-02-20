package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingProps extends StObject {
  
  var padding: js.UndefOr[String | Double] = js.native
  
  var paddingBottom: js.UndefOr[String | Double] = js.native
  
  var paddingLeft: js.UndefOr[String | Double] = js.native
  
  var paddingRight: js.UndefOr[String | Double] = js.native
  
  var paddingTop: js.UndefOr[String | Double] = js.native
}
object PaddingProps {
  
  @scala.inline
  def apply(): PaddingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingProps]
  }
  
  @scala.inline
  implicit class PaddingPropsMutableBuilder[Self <: PaddingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: String | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: String | Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: String | Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: String | Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: String | Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
