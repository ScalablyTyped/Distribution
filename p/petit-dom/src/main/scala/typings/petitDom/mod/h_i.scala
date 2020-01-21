package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.i
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_i extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: i): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, children: Content*): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, props: Props[E], children: Content*): ElementNode[i, E] = js.native
}

