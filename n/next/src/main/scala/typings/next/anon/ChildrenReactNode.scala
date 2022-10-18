package typings.next.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenReactNode extends StObject {
  
  var children: ReactNode
}
object ChildrenReactNode {
  
  inline def apply(): ChildrenReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenReactNode]
  }
  
  extension [Self <: ChildrenReactNode](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
