package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.`var`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_var extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: `var`): ElementNode[`var`, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: `var`, children: Content*): ElementNode[`var`, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: `var`, props: Props[E], children: Content*): ElementNode[`var`, E] = js.native
}

