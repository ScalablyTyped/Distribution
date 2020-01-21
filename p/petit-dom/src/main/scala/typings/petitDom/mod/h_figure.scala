package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.figure
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_figure extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: figure): ElementNode[figure, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: figure, children: Content*): ElementNode[figure, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: figure, props: Props[E], children: Content*): ElementNode[figure, E] = js.native
}

