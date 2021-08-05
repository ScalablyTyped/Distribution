package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var useDefault: js.UndefOr[Boolean] = js.undefined
}
object SelectProps {
  
  inline def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  
  extension [Self <: SelectProps](x: Self) {
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
