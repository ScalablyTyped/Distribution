package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.cite
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_cite extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: cite): ElementNode[cite, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: cite, children: Content*): ElementNode[cite, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: cite, props: Props[E], children: Content*): ElementNode[cite, E] = js.native
}

