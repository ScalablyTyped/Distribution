package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.optgroup
import typings.std.HTMLOptGroupElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_optgroup extends js.Object {
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup): ElementNode[optgroup, E] = js.native
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup, children: Content*): ElementNode[optgroup, E] = js.native
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup, props: Props[E], children: Content*): ElementNode[optgroup, E] = js.native
}

