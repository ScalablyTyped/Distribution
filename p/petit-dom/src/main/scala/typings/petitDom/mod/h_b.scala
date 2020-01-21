package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.b
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_b extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: b): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, children: Content*): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, props: Props[E], children: Content*): ElementNode[b, E] = js.native
}

