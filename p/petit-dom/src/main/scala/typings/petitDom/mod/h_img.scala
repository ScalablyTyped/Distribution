package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.img
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_img extends js.Object {
  def apply[E /* <: HTMLImageElement */](`type`: img): ElementNode[img, E] = js.native
  def apply[E /* <: HTMLImageElement */](`type`: img, children: Content*): ElementNode[img, E] = js.native
  def apply[E /* <: HTMLImageElement */](`type`: img, props: Props[E], children: Content*): ElementNode[img, E] = js.native
}

