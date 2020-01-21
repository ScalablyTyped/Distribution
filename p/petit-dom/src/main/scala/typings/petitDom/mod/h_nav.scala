package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.nav
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_nav extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: nav): ElementNode[nav, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: nav, children: Content*): ElementNode[nav, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: nav, props: Props[E], children: Content*): ElementNode[nav, E] = js.native
}

