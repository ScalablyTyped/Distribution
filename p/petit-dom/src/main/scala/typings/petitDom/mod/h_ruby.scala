package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.ruby
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ruby extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: ruby): ElementNode[ruby, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: ruby, children: Content*): ElementNode[ruby, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: ruby, props: Props[E], children: Content*): ElementNode[ruby, E] = js.native
}

