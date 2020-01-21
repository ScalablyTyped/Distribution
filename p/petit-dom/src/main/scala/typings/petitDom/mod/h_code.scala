package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.code
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_code extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: code): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, children: Content*): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, props: Props[E], children: Content*): ElementNode[code, E] = js.native
}

