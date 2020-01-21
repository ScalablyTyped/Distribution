package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.summary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_summary extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: summary): ElementNode[summary, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: summary, children: Content*): ElementNode[summary, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: summary, props: Props[E], children: Content*): ElementNode[summary, E] = js.native
}

