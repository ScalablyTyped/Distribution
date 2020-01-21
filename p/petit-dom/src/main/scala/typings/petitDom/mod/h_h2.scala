package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.h2
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_h2 extends js.Object {
  def apply[E /* <: HTMLHeadingElement */](`type`: h2): ElementNode[h2, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h2, children: Content*): ElementNode[h2, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h2, props: Props[E], children: Content*): ElementNode[h2, E] = js.native
}

