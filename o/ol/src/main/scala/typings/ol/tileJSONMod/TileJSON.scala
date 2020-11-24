package typings.ol.tileJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileJSON
  extends typings.ol.tileImageMod.default {
  
  def getTileJSON(): Config = js.native
  
  /* protected */ def handleTileJSONError(): Unit = js.native
  
  /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
}
