package typings
package olLib.sourceTileJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileJSON
  extends olLib.sourceTileImageMod.default {
  def getTileJSON(): Config = js.native
  /* protected */ def handleTileJSONError(): scala.Unit = js.native
  /* protected */ def handleTileJSONResponse(tileJSON: Config): scala.Unit = js.native
}

