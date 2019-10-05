package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.rp
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_rp extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: rp): ElementNode[rp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rp, children: Content*): ElementNode[rp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rp, props: Props[E], children: Content*): ElementNode[rp, E] = js.native
}

