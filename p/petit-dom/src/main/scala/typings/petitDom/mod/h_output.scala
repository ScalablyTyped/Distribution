package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.output
import typings.std.HTMLOutputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_output extends js.Object {
  def apply[E /* <: HTMLOutputElement */](`type`: output): ElementNode[output, E] = js.native
  def apply[E /* <: HTMLOutputElement */](`type`: output, children: Content*): ElementNode[output, E] = js.native
  def apply[E /* <: HTMLOutputElement */](`type`: output, props: Props[E], children: Content*): ElementNode[output, E] = js.native
}

