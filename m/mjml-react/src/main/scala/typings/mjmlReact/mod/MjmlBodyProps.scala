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
  
  inline def apply(): MjmlBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBodyProps]
  }
  
  extension [Self <: MjmlBodyProps](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
