package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.picture
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

