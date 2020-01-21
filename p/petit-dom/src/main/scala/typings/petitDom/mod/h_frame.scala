package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.frame
import typings.std.HTMLFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_frame extends js.Object {
  def apply[E /* <: HTMLFrameElement */](`type`: frame): ElementNode[frame, E] = js.native
  def apply[E /* <: HTMLFrameElement */](`type`: frame, children: Content*): ElementNode[frame, E] = js.native
  def apply[E /* <: HTMLFrameElement */](`type`: frame, props: Props[E], children: Content*): ElementNode[frame, E] = js.native
}

