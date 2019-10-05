package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.body
import typings.std.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_body extends js.Object {
  def apply[E /* <: HTMLBodyElement */](`type`: body): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, children: Content*): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, props: Props[E], children: Content*): ElementNode[body, E] = js.native
}

