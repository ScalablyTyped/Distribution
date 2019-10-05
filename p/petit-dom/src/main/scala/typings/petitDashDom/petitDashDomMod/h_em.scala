package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.em
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_em extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: em): ElementNode[em, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: em, children: Content*): ElementNode[em, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: em, props: Props[E], children: Content*): ElementNode[em, E] = js.native
}

