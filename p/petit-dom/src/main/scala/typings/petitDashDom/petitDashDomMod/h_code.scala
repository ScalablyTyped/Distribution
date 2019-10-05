package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.code
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_code extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: code): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, children: Content*): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, props: Props[E], children: Content*): ElementNode[code, E] = js.native
}

