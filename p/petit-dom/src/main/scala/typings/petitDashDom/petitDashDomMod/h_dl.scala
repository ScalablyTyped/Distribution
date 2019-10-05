package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.dl
import typings.std.HTMLDListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dl extends js.Object {
  def apply[E /* <: HTMLDListElement */](`type`: dl): ElementNode[dl, E] = js.native
  def apply[E /* <: HTMLDListElement */](`type`: dl, children: Content*): ElementNode[dl, E] = js.native
  def apply[E /* <: HTMLDListElement */](`type`: dl, props: Props[E], children: Content*): ElementNode[dl, E] = js.native
}

