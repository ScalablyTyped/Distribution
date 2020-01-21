package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.samp
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_samp extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: samp): ElementNode[samp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: samp, children: Content*): ElementNode[samp, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: samp, props: Props[E], children: Content*): ElementNode[samp, E] = js.native
}

