package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.colgroup
import typings.std.HTMLTableColElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_colgroup extends js.Object {
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup): ElementNode[colgroup, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup, children: Content*): ElementNode[colgroup, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup, props: Props[E], children: Content*): ElementNode[colgroup, E] = js.native
}

