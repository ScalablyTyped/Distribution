package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.sub
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_sub extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: sub): ElementNode[sub, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sub, children: Content*): ElementNode[sub, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sub, props: Props[E], children: Content*): ElementNode[sub, E] = js.native
}

