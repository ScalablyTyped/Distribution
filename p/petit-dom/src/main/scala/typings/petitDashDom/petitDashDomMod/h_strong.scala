package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.strong
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_strong extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: strong): ElementNode[strong, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: strong, children: Content*): ElementNode[strong, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: strong, props: Props[E], children: Content*): ElementNode[strong, E] = js.native
}

