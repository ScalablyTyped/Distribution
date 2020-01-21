package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.video
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

