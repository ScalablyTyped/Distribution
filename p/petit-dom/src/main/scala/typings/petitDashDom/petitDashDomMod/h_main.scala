package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.main
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_main extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: main): ElementNode[main, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: main, children: Content*): ElementNode[main, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: main, props: Props[E], children: Content*): ElementNode[main, E] = js.native
}

