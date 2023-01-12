package typings.mjmlReact.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredChildrenProps extends StObject {
  
  var children: ReactNode
}
object RequiredChildrenProps {
  
  inline def apply(): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredChildrenProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredChildrenProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
