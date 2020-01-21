package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.head
import typings.std.HTMLHeadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_head extends js.Object {
  def apply[E /* <: HTMLHeadElement */](`type`: head): ElementNode[head, E] = js.native
  def apply[E /* <: HTMLHeadElement */](`type`: head, children: Content*): ElementNode[head, E] = js.native
  def apply[E /* <: HTMLHeadElement */](`type`: head, props: Props[E], children: Content*): ElementNode[head, E] = js.native
}

