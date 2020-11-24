package typings.ol

import typings.ol.olTileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/tileurlfunction", JSImport.Namespace)
@js.native
object tileurlfunctionMod extends js.Object {
  
  def createFromTemplate(template: String, tileGrid: default): UrlFunction = js.native
  
  def createFromTemplates(templates: js.Array[String], tileGrid: default): UrlFunction = js.native
  
  def createFromTileUrlFunctions(tileUrlFunctions: js.Array[UrlFunction]): UrlFunction = js.native
  
  def expandUrl(url: String): js.Array[String] = js.native
  
  def nullTileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typings.ol.projectionMod.default): js.UndefOr[String] = js.native
}
