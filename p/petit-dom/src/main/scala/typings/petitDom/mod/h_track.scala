package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.track
import typings.std.HTMLTrackElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_track extends js.Object {
  def apply[E /* <: HTMLTrackElement */](`type`: track): ElementNode[track, E] = js.native
  def apply[E /* <: HTMLTrackElement */](`type`: track, children: Content*): ElementNode[track, E] = js.native
  def apply[E /* <: HTMLTrackElement */](`type`: track, props: Props[E], children: Content*): ElementNode[track, E] = js.native
}

