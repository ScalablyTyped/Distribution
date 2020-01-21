package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dl
import typings.std.HTMLDListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dl extends js.Object {
  def apply[E /* <: HTMLDListElement */](`type`: dl): ElementNode[dl, E] = js.native
  def apply[E /* <: HTMLDListElement */](`type`: dl, children: Content*): ElementNode[dl, E] = js.native
  def apply[E /* <: HTMLDListElement */](`type`: dl, props: Props[E], children: Content*): ElementNode[dl, E] = js.native
}

