package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.h1
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_h1 extends js.Object {
  def apply[E /* <: HTMLHeadingElement */](`type`: h1): ElementNode[h1, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h1, children: Content*): ElementNode[h1, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h1, props: Props[E], children: Content*): ElementNode[h1, E] = js.native
}

