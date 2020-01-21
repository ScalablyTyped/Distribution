package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.picture
import typings.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_picture extends js.Object {
  def apply[E /* <: HTMLPictureElement */](`type`: picture): ElementNode[picture, E] = js.native
  def apply[E /* <: HTMLPictureElement */](`type`: picture, children: Content*): ElementNode[picture, E] = js.native
  def apply[E /* <: HTMLPictureElement */](`type`: picture, props: Props[E], children: Content*): ElementNode[picture, E] = js.native
}

