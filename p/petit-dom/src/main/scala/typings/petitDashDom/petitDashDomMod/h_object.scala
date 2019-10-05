package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.`object`
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_object extends js.Object {
  def apply[E /* <: HTMLObjectElement */](`type`: `object`): ElementNode[`object`, E] = js.native
  def apply[E /* <: HTMLObjectElement */](`type`: `object`, children: Content*): ElementNode[`object`, E] = js.native
  def apply[E /* <: HTMLObjectElement */](`type`: `object`, props: Props[E], children: Content*): ElementNode[`object`, E] = js.native
}

