package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var fluid: js.UndefOr[Boolean] = js.undefined
}
object ContainerProps {
  
  inline def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  extension [Self <: ContainerProps](x: Self) {
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
  }
}
