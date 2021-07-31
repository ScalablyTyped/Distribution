package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlBodyProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MjmlBodyProps {
  
  @scala.inline
  def apply(): MjmlBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBodyProps]
  }
  
  @scala.inline
  implicit class MjmlBodyPropsMutableBuilder[Self <: MjmlBodyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
