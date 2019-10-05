package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.bdi
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_bdi extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: bdi): ElementNode[bdi, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdi, children: Content*): ElementNode[bdi, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdi, props: Props[E], children: Content*): ElementNode[bdi, E] = js.native
}

