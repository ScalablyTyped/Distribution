package typings
package olLib.sourceSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source
  extends olLib.objectMod.default {
  def getAttributions(): Attribution = js.native
  def getAttributionsCollapsible(): scala.Boolean = js.native
  def getProjection(): olLib.projProjectionMod.default = js.native
  def getResolutions(): js.Array[scala.Double] = js.native
  def getState(): olLib.sourceStateMod.State = js.native
  def getWrapX(): scala.Boolean = js.native
  def refresh(): scala.Unit = js.native
  def setAttributions(attributions: AttributionLike): scala.Unit = js.native
  /* protected */ def setState(state: olLib.sourceStateMod.State): scala.Unit = js.native
}

