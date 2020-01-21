package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.body
import typings.std.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_body extends js.Object {
  def apply[E /* <: HTMLBodyElement */](`type`: body): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, children: Content*): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, props: Props[E], children: Content*): ElementNode[body, E] = js.native
}

