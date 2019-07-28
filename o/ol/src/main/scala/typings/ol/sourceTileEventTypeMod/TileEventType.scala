package typings.ol.sourceTileEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileEventType extends js.Object

@JSImport("ol/source/TileEventType", "TileEventType")
@js.native
object TileEventType extends js.Object {
  @js.native
  sealed trait TILELOADEND extends TileEventType
  
  @js.native
  sealed trait TILELOADERROR extends TileEventType
  
  @js.native
  sealed trait TILELOADSTART extends TileEventType
  
}

