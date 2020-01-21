package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.br
import typings.std.HTMLBRElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_br extends js.Object {
  def apply[E /* <: HTMLBRElement */](`type`: br): ElementNode[br, E] = js.native
  def apply[E /* <: HTMLBRElement */](`type`: br, children: Content*): ElementNode[br, E] = js.native
  def apply[E /* <: HTMLBRElement */](`type`: br, props: Props[E], children: Content*): ElementNode[br, E] = js.native
}

