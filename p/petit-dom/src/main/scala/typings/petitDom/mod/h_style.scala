package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.style
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_style extends js.Object {
  def apply[E /* <: HTMLStyleElement */](`type`: style): ElementNode[style, E] = js.native
  def apply[E /* <: HTMLStyleElement */](`type`: style, children: Content*): ElementNode[style, E] = js.native
  def apply[E /* <: HTMLStyleElement */](`type`: style, props: Props[E], children: Content*): ElementNode[style, E] = js.native
}

