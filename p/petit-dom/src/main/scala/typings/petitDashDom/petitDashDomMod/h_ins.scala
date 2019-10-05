package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.ins
import typings.std.HTMLModElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ins extends js.Object {
  def apply[E /* <: HTMLModElement */](`type`: ins): ElementNode[ins, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: ins, children: Content*): ElementNode[ins, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: ins, props: Props[E], children: Content*): ElementNode[ins, E] = js.native
}

