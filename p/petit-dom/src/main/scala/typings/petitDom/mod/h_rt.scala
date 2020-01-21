package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.rt
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_rt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: rt): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, children: Content*): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, props: Props[E], children: Content*): ElementNode[rt, E] = js.native
}

