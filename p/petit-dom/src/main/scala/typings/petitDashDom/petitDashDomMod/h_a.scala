package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.a
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_a extends js.Object {
  def apply[E /* <: HTMLAnchorElement */](`type`: a): ElementNode[a, E] = js.native
  def apply[E /* <: HTMLAnchorElement */](`type`: a, children: Content*): ElementNode[a, E] = js.native
  def apply[E /* <: HTMLAnchorElement */](`type`: a, props: Props[E], children: Content*): ElementNode[a, E] = js.native
}

