package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.param
import typings.std.HTMLParamElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_param extends js.Object {
  def apply[E /* <: HTMLParamElement */](`type`: param): ElementNode[param, E] = js.native
  def apply[E /* <: HTMLParamElement */](`type`: param, children: Content*): ElementNode[param, E] = js.native
  def apply[E /* <: HTMLParamElement */](`type`: param, props: Props[E], children: Content*): ElementNode[param, E] = js.native
}

