package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.iframe
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

