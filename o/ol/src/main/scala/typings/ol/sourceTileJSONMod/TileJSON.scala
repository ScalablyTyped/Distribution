package typings.ol.sourceTileJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileJSON
  extends typings.ol.sourceTileImageMod.default {
  def getTileJSON(): Config = js.native
  /* protected */ def handleTileJSONError(): Unit = js.native
  /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
}

