package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.track
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

