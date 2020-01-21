package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.frameset
import typings.std.HTMLFrameSetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_frameset extends js.Object {
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset): ElementNode[frameset, E] = js.native
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset, children: Content*): ElementNode[frameset, E] = js.native
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset, props: Props[E], children: Content*): ElementNode[frameset, E] = js.native
}

