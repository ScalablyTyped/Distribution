package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.ruby
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ruby extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: ruby): ElementNode[ruby, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: ruby, children: Content*): ElementNode[ruby, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: ruby, props: Props[E], children: Content*): ElementNode[ruby, E] = js.native
}

