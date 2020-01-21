package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.aside
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_aside extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: aside): ElementNode[aside, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: aside, children: Content*): ElementNode[aside, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: aside, props: Props[E], children: Content*): ElementNode[aside, E] = js.native
}

