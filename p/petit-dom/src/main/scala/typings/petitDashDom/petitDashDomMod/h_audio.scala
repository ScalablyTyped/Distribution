package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.audio
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

