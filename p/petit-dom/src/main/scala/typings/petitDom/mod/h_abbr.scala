package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.abbr
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_abbr extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: abbr): ElementNode[abbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: abbr, children: Content*): ElementNode[abbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: abbr, props: Props[E], children: Content*): ElementNode[abbr, E] = js.native
}

