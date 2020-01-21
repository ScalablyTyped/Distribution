package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dt
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dt): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, children: Content*): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, props: Props[E], children: Content*): ElementNode[dt, E] = js.native
}

