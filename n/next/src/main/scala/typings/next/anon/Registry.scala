package typings.next.anon

import typings.next.styledJsxMod.StyledJsxStyleRegistry
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry extends StObject {
  
  var children: typings.react.mod.global.JSX.Element | ReactNode
  
  var registry: js.UndefOr[StyledJsxStyleRegistry] = js.undefined
}
object Registry {
  
  inline def apply(): Registry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registry]
  }
  
  extension [Self <: Registry](x: Self) {
    
    inline def setChildren(value: typings.react.mod.global.JSX.Element | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setRegistry(value: StyledJsxStyleRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
  }
}
