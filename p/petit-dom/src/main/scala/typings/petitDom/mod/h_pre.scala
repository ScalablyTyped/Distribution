package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.pre
import typings.std.HTMLPreElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_pre extends js.Object {
  def apply[E /* <: HTMLPreElement */](`type`: pre): ElementNode[pre, E] = js.native
  def apply[E /* <: HTMLPreElement */](`type`: pre, children: Content*): ElementNode[pre, E] = js.native
  def apply[E /* <: HTMLPreElement */](`type`: pre, props: Props[E], children: Content*): ElementNode[pre, E] = js.native
}

