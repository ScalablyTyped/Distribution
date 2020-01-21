package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.hgroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_hgroup extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: hgroup): ElementNode[hgroup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: hgroup, children: Content*): ElementNode[hgroup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: hgroup, props: Props[E], children: Content*): ElementNode[hgroup, E] = js.native
}

