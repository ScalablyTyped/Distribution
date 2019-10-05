package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.samp
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_samp extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: samp): ElementNode[samp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: samp, children: Content*): ElementNode[samp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: samp, props: Props[E], children: Content*): ElementNode[samp, E] = js.native
}

