package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.th
import typings.std.HTMLTableHeaderCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_th extends js.Object {
  def apply[E /* <: HTMLTableHeaderCellElement */](`type`: th): ElementNode[th, E] = js.native
  def apply[E /* <: HTMLTableHeaderCellElement */](`type`: th, children: Content*): ElementNode[th, E] = js.native
  def apply[E /* <: HTMLTableHeaderCellElement */](`type`: th, props: Props[E], children: Content*): ElementNode[th, E] = js.native
}

