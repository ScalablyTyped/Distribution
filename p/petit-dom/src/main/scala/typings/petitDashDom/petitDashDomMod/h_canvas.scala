package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.canvas
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_canvas extends js.Object {
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas): ElementNode[canvas, E] = js.native
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas, children: Content*): ElementNode[canvas, E] = js.native
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas, props: Props[E], children: Content*): ElementNode[canvas, E] = js.native
}

