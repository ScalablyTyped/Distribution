package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.marquee
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

