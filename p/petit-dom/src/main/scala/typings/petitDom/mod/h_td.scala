package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.td
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_td extends js.Object {
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td): ElementNode[td, E] = js.native
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td, children: Content*): ElementNode[td, E] = js.native
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td, props: Props[E], children: Content*): ElementNode[td, E] = js.native
}

