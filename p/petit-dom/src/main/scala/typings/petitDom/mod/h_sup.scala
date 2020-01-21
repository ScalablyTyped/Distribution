package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.sup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_sup extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: sup): ElementNode[sup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sup, children: Content*): ElementNode[sup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sup, props: Props[E], children: Content*): ElementNode[sup, E] = js.native
}

