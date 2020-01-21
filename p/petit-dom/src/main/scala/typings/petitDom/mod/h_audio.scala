package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.audio
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_audio extends js.Object {
  def apply[E /* <: HTMLAudioElement */](`type`: audio): ElementNode[audio, E] = js.native
  def apply[E /* <: HTMLAudioElement */](`type`: audio, children: Content*): ElementNode[audio, E] = js.native
  def apply[E /* <: HTMLAudioElement */](`type`: audio, props: Props[E], children: Content*): ElementNode[audio, E] = js.native
}

