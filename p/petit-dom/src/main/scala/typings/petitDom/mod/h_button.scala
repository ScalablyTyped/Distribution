package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.button
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_button extends js.Object {
  def apply[E /* <: HTMLButtonElement */](`type`: button): ElementNode[button, E] = js.native
  def apply[E /* <: HTMLButtonElement */](`type`: button, children: Content*): ElementNode[button, E] = js.native
  def apply[E /* <: HTMLButtonElement */](`type`: button, props: Props[E], children: Content*): ElementNode[button, E] = js.native
}

