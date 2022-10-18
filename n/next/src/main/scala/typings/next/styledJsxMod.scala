package typings.next

import typings.next.anon.Nonce
import typings.next.anon.Registry
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledJsxMod {
  
  @JSImport("styled-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StyleRegistry(hasChildrenRegistry: Registry): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleRegistry")(hasChildrenRegistry.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  inline def useStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  @js.native
  trait StyledJsxStyleRegistry extends StObject {
    
    def add(props: Any): Unit = js.native
    
    def flush(): Unit = js.native
    
    def remove(props: Any): Unit = js.native
    
    def styles(): js.Array[Element] = js.native
    def styles(options: Nonce): js.Array[Element] = js.native
  }
}
