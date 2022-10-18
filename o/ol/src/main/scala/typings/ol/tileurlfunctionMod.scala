package typings.ol

import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileurlfunctionMod {
  
  @JSImport("ol/tileurlfunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFromTemplate(template: String, tileGrid: default): UrlFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromTemplate")(template.asInstanceOf[js.Any], tileGrid.asInstanceOf[js.Any])).asInstanceOf[UrlFunction]
  
  inline def createFromTemplates(templates: js.Array[String], tileGrid: default): UrlFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromTemplates")(templates.asInstanceOf[js.Any], tileGrid.asInstanceOf[js.Any])).asInstanceOf[UrlFunction]
  
  inline def createFromTileUrlFunctions(tileUrlFunctions: js.Array[UrlFunction]): UrlFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTileUrlFunctions")(tileUrlFunctions.asInstanceOf[js.Any]).asInstanceOf[UrlFunction]
  
  inline def expandUrl(url: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def nullTileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typings.ol.projProjectionMod.default): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nullTileUrlFunction")(tileCoord.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
