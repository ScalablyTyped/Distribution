package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.details
import typings.std.HTMLDetailsElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_details extends js.Object {
  def apply[E /* <: HTMLDetailsElement */](`type`: details): ElementNode[details, E] = js.native
  def apply[E /* <: HTMLDetailsElement */](`type`: details, children: Content*): ElementNode[details, E] = js.native
  def apply[E /* <: HTMLDetailsElement */](`type`: details, props: Props[E], children: Content*): ElementNode[details, E] = js.native
}

