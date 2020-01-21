package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.details
import typings.std.HTMLDetailsElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_details extends js.Object {
  def apply[E /* <: HTMLDetailsElement */](`type`: details): ElementNode[details, E] = js.native
  def apply[E /* <: HTMLDetailsElement */](`type`: details, children: Content*): ElementNode[details, E] = js.native
  def apply[E /* <: HTMLDetailsElement */](`type`: details, props: Props[E], children: Content*): ElementNode[details, E] = js.native
}

