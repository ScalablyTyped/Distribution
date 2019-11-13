package typings.next

import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/head", JSImport.Namespace)
@js.native
object headMod extends js.Object {
  def defaultHead(): js.Array[Element] = js.native
  def defaultHead(inAmpMode: Boolean): js.Array[Element] = js.native
  @js.native
  object default extends js.Object {
    var rewind: js.Function0[js.UndefOr[js.Array[ReactElement]]] = js.native
    /**
      * This component injects elements to `<head>` of your page.
      * To avoid duplicated `tags` in `<head>` you can use the `key` property, which will make sure every tag is only rendered once.
      */
    def apply(hasChildren: Anon_Children): Element = js.native
  }
  
}

