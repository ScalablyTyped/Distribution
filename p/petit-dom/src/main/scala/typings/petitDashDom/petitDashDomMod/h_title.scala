package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.title
import typings.std.HTMLTitleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_title extends js.Object {
  def apply[E /* <: HTMLTitleElement */](`type`: title): ElementNode[title, E] = js.native
  def apply[E /* <: HTMLTitleElement */](`type`: title, children: Content*): ElementNode[title, E] = js.native
  def apply[E /* <: HTMLTitleElement */](`type`: title, props: Props[E], children: Content*): ElementNode[title, E] = js.native
}

