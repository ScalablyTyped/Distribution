package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.figcaption
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_figcaption extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: figcaption): ElementNode[figcaption, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: figcaption, children: Content*): ElementNode[figcaption, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: figcaption, props: Props[E], children: Content*): ElementNode[figcaption, E] = js.native
}

