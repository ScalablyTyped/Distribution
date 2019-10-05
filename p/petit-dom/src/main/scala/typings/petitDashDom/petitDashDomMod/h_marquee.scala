package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.marquee
import typings.std.HTMLMarqueeElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_marquee extends js.Object {
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee): ElementNode[marquee, E] = js.native
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee, children: Content*): ElementNode[marquee, E] = js.native
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee, props: Props[E], children: Content*): ElementNode[marquee, E] = js.native
}

