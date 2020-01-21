package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.ul
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ul extends js.Object {
  def apply[E /* <: HTMLUListElement */](`type`: ul): ElementNode[ul, E] = js.native
  def apply[E /* <: HTMLUListElement */](`type`: ul, children: Content*): ElementNode[ul, E] = js.native
  def apply[E /* <: HTMLUListElement */](`type`: ul, props: Props[E], children: Content*): ElementNode[ul, E] = js.native
}

