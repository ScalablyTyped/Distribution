package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.dt
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dt): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, children: Content*): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, props: Props[E], children: Content*): ElementNode[dt, E] = js.native
}

