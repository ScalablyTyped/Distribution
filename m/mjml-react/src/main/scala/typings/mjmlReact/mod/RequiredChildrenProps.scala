package typings.mjmlReact.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredChildrenProps extends StObject {
  
  var children: ReactNode = js.native
}
object RequiredChildrenProps {
  
  @scala.inline
  def apply(): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredChildrenProps]
  }
  
  @scala.inline
  implicit class RequiredChildrenPropsMutableBuilder[Self <: RequiredChildrenProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
