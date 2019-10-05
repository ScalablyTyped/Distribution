package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.source
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

