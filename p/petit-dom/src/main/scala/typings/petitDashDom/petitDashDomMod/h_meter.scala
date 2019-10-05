package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.meter
import typings.std.HTMLMeterElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_meter extends js.Object {
  def apply[E /* <: HTMLMeterElement */](`type`: meter): ElementNode[meter, E] = js.native
  def apply[E /* <: HTMLMeterElement */](`type`: meter, children: Content*): ElementNode[meter, E] = js.native
  def apply[E /* <: HTMLMeterElement */](`type`: meter, props: Props[E], children: Content*): ElementNode[meter, E] = js.native
}

