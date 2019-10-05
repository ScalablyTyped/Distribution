package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.section
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_section extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: section): ElementNode[section, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: section, children: Content*): ElementNode[section, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: section, props: Props[E], children: Content*): ElementNode[section, E] = js.native
}

