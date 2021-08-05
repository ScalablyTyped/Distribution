package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var lg: js.UndefOr[Double] = js.undefined
  
  var md: js.UndefOr[Double] = js.undefined
  
  var sm: js.UndefOr[Double] = js.undefined
  
  var xs: js.UndefOr[Double] = js.undefined
}
object RowProps {
  
  inline def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  extension [Self <: RowProps](x: Self) {
    
    inline def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
    
    inline def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    inline def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
  }
}
