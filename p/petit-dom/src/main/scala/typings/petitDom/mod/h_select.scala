package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.select
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_select extends js.Object {
  def apply[E /* <: HTMLSelectElement */](`type`: select): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, children: Content*): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, props: Props[E], children: Content*): ElementNode[select, E] = js.native
}

