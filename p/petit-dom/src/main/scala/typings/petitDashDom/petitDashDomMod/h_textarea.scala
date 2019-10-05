package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.textarea
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_textarea extends js.Object {
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea): ElementNode[textarea, E] = js.native
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea, children: Content*): ElementNode[textarea, E] = js.native
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea, props: Props[E], children: Content*): ElementNode[textarea, E] = js.native
}

