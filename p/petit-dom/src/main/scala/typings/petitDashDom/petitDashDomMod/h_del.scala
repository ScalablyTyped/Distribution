package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.del
import typings.std.HTMLModElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_del extends js.Object {
  def apply[E /* <: HTMLModElement */](`type`: del): ElementNode[del, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: del, children: Content*): ElementNode[del, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: del, props: Props[E], children: Content*): ElementNode[del, E] = js.native
}

