package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tileurlfunction", JSImport.Namespace)
@js.native
object tileurlfunctionMod extends js.Object {
  def createFromTemplate(template: java.lang.String, tileGrid: olLib.tilegridTileGridMod.default): olLib.tileMod.UrlFunction = js.native
  def createFromTemplates(templates: js.Array[java.lang.String], tileGrid: olLib.tilegridTileGridMod.default): olLib.tileMod.UrlFunction = js.native
  def createFromTileUrlFunctions(tileUrlFunctions: js.Array[olLib.tileMod.UrlFunction]): olLib.tileMod.UrlFunction = js.native
  def expandUrl(url: java.lang.String): js.Array[java.lang.String] = js.native
  def nullTileUrlFunction(
    tileCoord: olLib.tilecoordMod.TileCoord,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): java.lang.String = js.native
}

