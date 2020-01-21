package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.bdo
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_bdo extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: bdo): ElementNode[bdo, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdo, children: Content*): ElementNode[bdo, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdo, props: Props[E], children: Content*): ElementNode[bdo, E] = js.native
}

