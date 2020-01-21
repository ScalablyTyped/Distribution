package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.small
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_small extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: small): ElementNode[small, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: small, children: Content*): ElementNode[small, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: small, props: Props[E], children: Content*): ElementNode[small, E] = js.native
}

