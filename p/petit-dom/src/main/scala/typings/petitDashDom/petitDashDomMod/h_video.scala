package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.video
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_video extends js.Object {
  def apply[E /* <: HTMLVideoElement */](`type`: video): ElementNode[video, E] = js.native
  def apply[E /* <: HTMLVideoElement */](`type`: video, children: Content*): ElementNode[video, E] = js.native
  def apply[E /* <: HTMLVideoElement */](`type`: video, props: Props[E], children: Content*): ElementNode[video, E] = js.native
}

