package typings.mirrorx.mod

import typings.history.mod.Location
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
}
object SwitchProps {
  
  inline def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
