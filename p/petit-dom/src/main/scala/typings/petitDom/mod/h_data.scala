package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.data
import typings.std.HTMLDataElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_data extends js.Object {
  def apply[E /* <: HTMLDataElement */](`type`: data): ElementNode[data, E] = js.native
  def apply[E /* <: HTMLDataElement */](`type`: data, children: Content*): ElementNode[data, E] = js.native
  def apply[E /* <: HTMLDataElement */](`type`: data, props: Props[E], children: Content*): ElementNode[data, E] = js.native
}

