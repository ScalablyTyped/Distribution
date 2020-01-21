package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.col
import typings.std.HTMLTableColElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_col extends js.Object {
  def apply[E /* <: HTMLTableColElement */](`type`: col): ElementNode[col, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: col, children: Content*): ElementNode[col, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: col, props: Props[E], children: Content*): ElementNode[col, E] = js.native
}

