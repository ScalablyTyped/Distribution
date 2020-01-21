package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.h3
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_h3 extends js.Object {
  def apply[E /* <: HTMLHeadingElement */](`type`: h3): ElementNode[h3, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h3, children: Content*): ElementNode[h3, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h3, props: Props[E], children: Content*): ElementNode[h3, E] = js.native
}

