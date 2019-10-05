package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.base
import typings.std.HTMLBaseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_base extends js.Object {
  def apply[E /* <: HTMLBaseElement */](`type`: base): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, children: Content*): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, props: Props[E], children: Content*): ElementNode[base, E] = js.native
}

