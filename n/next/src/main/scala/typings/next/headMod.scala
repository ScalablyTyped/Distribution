package typings.next

import typings.next.anon.ChildrenReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headMod {
  
  @JSImport("next/head", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This component injects elements to `<head>` of your page.
    * To avoid duplicated `tags` in `<head>` you can use the `key` property, which will make sure every tag is only rendered once.
    */
  inline def default(param0: ChildrenReactNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def defaultHead(): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultHead")().asInstanceOf[js.Array[Element]]
  inline def defaultHead(inAmpMode: Boolean): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultHead")(inAmpMode.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
}
