package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.header
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_header extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: header): ElementNode[header, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: header, children: Content*): ElementNode[header, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: header, props: Props[E], children: Content*): ElementNode[header, E] = js.native
}

