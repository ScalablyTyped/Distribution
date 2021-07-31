package typings.ol

import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilecoordMod {
  
  @JSImport("ol/tilecoord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createOrUpdate(z: Double, x: Double, y: Double): TileCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(z.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[TileCoord]
  @scala.inline
  def createOrUpdate(z: Double, x: Double, y: Double, opt_tileCoord: TileCoord): TileCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(z.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], opt_tileCoord.asInstanceOf[js.Any])).asInstanceOf[TileCoord]
  
  @scala.inline
  def fromKey(key: String): TileCoord = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any]).asInstanceOf[TileCoord]
  
  @scala.inline
  def getKey(tileCoord: TileCoord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(tileCoord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getKeyZXY(z: Double, x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyZXY")(z.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hash(tileCoord: TileCoord): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(tileCoord.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def withinExtentAndZ(tileCoord: TileCoord, tileGrid: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("withinExtentAndZ")(tileCoord.asInstanceOf[js.Any], tileGrid.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type TileCoord = js.Array[Double]
}
