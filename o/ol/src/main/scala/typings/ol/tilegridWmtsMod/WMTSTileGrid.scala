package typings.ol.tilegridWmtsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSTileGrid
  extends typings.ol.tilegridTileGridMod.default {
  
  def getMatrixId(z: Double): String = js.native
  
  /**
    * Get the list of matrix identifiers.
    */
  def getMatrixIds(): js.Array[String] = js.native
}
