package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.iframe
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_iframe extends js.Object {
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe): ElementNode[iframe, E] = js.native
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe, children: Content*): ElementNode[iframe, E] = js.native
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe, props: Props[E], children: Content*): ElementNode[iframe, E] = js.native
}

