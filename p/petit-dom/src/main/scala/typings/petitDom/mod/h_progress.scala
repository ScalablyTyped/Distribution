package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.progress
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

