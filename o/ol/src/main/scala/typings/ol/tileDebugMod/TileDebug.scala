package typings.ol.tileDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileDebug
  extends typings.ol.xyzMod.default {
  
  def getTile(z: Double, x: Double, y: Double): LabeledTile = js.native
}
