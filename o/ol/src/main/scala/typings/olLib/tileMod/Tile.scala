package typings
package olLib.tileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile
  extends olLib.eventsTargetMod.default {
  var state: olLib.tileStateMod.TileState = js.native
  /* protected */ def changed(): scala.Unit = js.native
  def endTransition(id: java.lang.String): scala.Unit = js.native
  def getAlpha(id: java.lang.String, time: scala.Double): scala.Double = js.native
  def getInterimTile(): Tile = js.native
  def getKey(): java.lang.String = js.native
  def getState(): olLib.tileStateMod.TileState = js.native
  def getTileCoord(): olLib.tilecoordMod.TileCoord = js.native
  def inTransition(id: java.lang.String): scala.Boolean = js.native
  def load(): scala.Unit = js.native
  def refreshInterimChain(): scala.Unit = js.native
  def setState(state: olLib.tileStateMod.TileState): scala.Unit = js.native
}

