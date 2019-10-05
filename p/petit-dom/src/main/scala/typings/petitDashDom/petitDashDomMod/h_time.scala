package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.time
import typings.std.HTMLTimeElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_time extends js.Object {
  def apply[E /* <: HTMLTimeElement */](`type`: time): ElementNode[time, E] = js.native
  def apply[E /* <: HTMLTimeElement */](`type`: time, children: Content*): ElementNode[time, E] = js.native
  def apply[E /* <: HTMLTimeElement */](`type`: time, props: Props[E], children: Content*): ElementNode[time, E] = js.native
}

