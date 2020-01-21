package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dfn
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dfn extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dfn): ElementNode[dfn, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dfn, children: Content*): ElementNode[dfn, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dfn, props: Props[E], children: Content*): ElementNode[dfn, E] = js.native
}

