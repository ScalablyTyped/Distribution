package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerProps extends HTMLAttributes[HTMLDivElement] {
  
  var fluid: js.UndefOr[Boolean] = js.native
}
object ContainerProps {
  
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  @scala.inline
  implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
  }
}
