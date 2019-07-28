package typings.parchment.distSrcBlotAbstractShadowMod

import typings.parchment.distSrcBlotAbstractBlotMod.Blot
import typings.parchment.distSrcBlotAbstractBlotMod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowBlot extends Blot {
  val statics: js.Any = js.native
  def replaceWith(name: String): Blot = js.native
  def replaceWith(name: Blot, value: js.Any): Blot = js.native
  def wrap(name: String): Parent = js.native
  def wrap(name: Parent, value: js.Any): Parent = js.native
}

