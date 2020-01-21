package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.h5
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_h5 extends js.Object {
  def apply[E /* <: HTMLHeadingElement */](`type`: h5): ElementNode[h5, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h5, children: Content*): ElementNode[h5, E] = js.native
  def apply[E /* <: HTMLHeadingElement */](`type`: h5, props: Props[E], children: Content*): ElementNode[h5, E] = js.native
}

