package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.frame
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

