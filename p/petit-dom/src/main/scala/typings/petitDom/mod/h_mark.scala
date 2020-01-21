package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.mark
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_mark extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: mark): ElementNode[mark, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: mark, children: Content*): ElementNode[mark, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: mark, props: Props[E], children: Content*): ElementNode[mark, E] = js.native
}

