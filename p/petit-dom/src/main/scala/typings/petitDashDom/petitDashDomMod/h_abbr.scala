package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.abbr
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_abbr extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: abbr): ElementNode[abbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: abbr, children: Content*): ElementNode[abbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: abbr, props: Props[E], children: Content*): ElementNode[abbr, E] = js.native
}

