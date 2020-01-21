package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.base
import typings.std.HTMLBaseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_base extends js.Object {
  def apply[E /* <: HTMLBaseElement */](`type`: base): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, children: Content*): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, props: Props[E], children: Content*): ElementNode[base, E] = js.native
}

