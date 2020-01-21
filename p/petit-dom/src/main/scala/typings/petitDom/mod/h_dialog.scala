package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dialog
import typings.std.HTMLDialogElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dialog extends js.Object {
  def apply[E /* <: HTMLDialogElement */](`type`: dialog): ElementNode[dialog, E] = js.native
  def apply[E /* <: HTMLDialogElement */](`type`: dialog, children: Content*): ElementNode[dialog, E] = js.native
  def apply[E /* <: HTMLDialogElement */](`type`: dialog, props: Props[E], children: Content*): ElementNode[dialog, E] = js.native
}

