package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.source
import typings.std.HTMLSourceElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_source extends js.Object {
  def apply[E /* <: HTMLSourceElement */](`type`: source): ElementNode[source, E] = js.native
  def apply[E /* <: HTMLSourceElement */](`type`: source, children: Content*): ElementNode[source, E] = js.native
  def apply[E /* <: HTMLSourceElement */](`type`: source, props: Props[E], children: Content*): ElementNode[source, E] = js.native
}

