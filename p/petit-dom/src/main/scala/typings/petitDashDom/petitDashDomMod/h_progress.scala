package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.progress
import typings.std.HTMLProgressElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_progress extends js.Object {
  def apply[E /* <: HTMLProgressElement */](`type`: progress): ElementNode[progress, E] = js.native
  def apply[E /* <: HTMLProgressElement */](`type`: progress, children: Content*): ElementNode[progress, E] = js.native
  def apply[E /* <: HTMLProgressElement */](`type`: progress, props: Props[E], children: Content*): ElementNode[progress, E] = js.native
}

