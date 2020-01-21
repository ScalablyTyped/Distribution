package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.canvas
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

