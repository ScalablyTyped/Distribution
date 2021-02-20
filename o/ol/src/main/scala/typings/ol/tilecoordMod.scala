package typings.ol

import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilecoordMod {
  
  @JSImport("ol/tilecoord", "createOrUpdate")
  @js.native
  def createOrUpdate(z: Double, x: Double, y: Double): TileCoord = js.native
  @JSImport("ol/tilecoord", "createOrUpdate")
  @js.native
  def createOrUpdate(z: Double, x: Double, y: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  
  @JSImport("ol/tilecoord", "fromKey")
  @js.native
  def fromKey(key: String): TileCoord = js.native
  
  @JSImport("ol/tilecoord", "getKey")
  @js.native
  def getKey(tileCoord: TileCoord): String = js.native
  
  @JSImport("ol/tilecoord", "getKeyZXY")
  @js.native
  def getKeyZXY(z: Double, x: Double, y: Double): String = js.native
  
  @JSImport("ol/tilecoord", "hash")
  @js.native
  def hash(tileCoord: TileCoord): Double = js.native
  
  @JSImport("ol/tilecoord", "withinExtentAndZ")
  @js.native
  def withinExtentAndZ(tileCoord: TileCoord, tileGrid: default): Boolean = js.native
  
  type TileCoord = js.Array[Double]
}
