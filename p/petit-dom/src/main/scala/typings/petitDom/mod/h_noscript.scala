package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.noscript
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_noscript extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: noscript): ElementNode[noscript, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: noscript, children: Content*): ElementNode[noscript, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: noscript, props: Props[E], children: Content*): ElementNode[noscript, E] = js.native
}

