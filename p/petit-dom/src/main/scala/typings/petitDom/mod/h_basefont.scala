package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.basefont
import typings.std.HTMLBaseFontElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_basefont extends js.Object {
  def apply[E /* <: HTMLBaseFontElement */](`type`: basefont): ElementNode[basefont, E] = js.native
  def apply[E /* <: HTMLBaseFontElement */](`type`: basefont, children: Content*): ElementNode[basefont, E] = js.native
  def apply[E /* <: HTMLBaseFontElement */](`type`: basefont, props: Props[E], children: Content*): ElementNode[basefont, E] = js.native
}

