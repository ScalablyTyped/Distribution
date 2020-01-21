package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.footer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_footer extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: footer): ElementNode[footer, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: footer, children: Content*): ElementNode[footer, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: footer, props: Props[E], children: Content*): ElementNode[footer, E] = js.native
}

