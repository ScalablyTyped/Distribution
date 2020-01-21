package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dd
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dd extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dd): ElementNode[dd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dd, children: Content*): ElementNode[dd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dd, props: Props[E], children: Content*): ElementNode[dd, E] = js.native
}

