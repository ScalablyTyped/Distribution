package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.html
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_html extends js.Object {
  def apply[E /* <: HTMLHtmlElement */](`type`: html): ElementNode[html, E] = js.native
  def apply[E /* <: HTMLHtmlElement */](`type`: html, children: Content*): ElementNode[html, E] = js.native
  def apply[E /* <: HTMLHtmlElement */](`type`: html, props: Props[E], children: Content*): ElementNode[html, E] = js.native
}

