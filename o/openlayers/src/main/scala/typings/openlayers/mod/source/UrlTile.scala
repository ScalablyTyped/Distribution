package typings.openlayers.mod.source

import typings.openlayers.mod.SourceUrlTileOptions
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.TileUrlFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Base class for sources providing tiles divided into a tile grid over http.
  *
  * @fires ol.source.TileEvent
  * @param options Image tile options.
  */
@JSImport("openlayers", "source.UrlTile")
@js.native
class UrlTile protected () extends Tile {
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    */
  def this(options: SourceUrlTileOptions) = this()
  
  /**
    * Return the tile load function of the source.
    * @return TileLoadFunction
    * @api
    */
  def getTileLoadFunction(): TileLoadFunctionType = js.native
  
  /**
    * Return the tile URL function of the source.
    * @return TileUrlFunction
    * @api
    */
  def getTileUrlFunction(): TileUrlFunctionType = js.native
  
  /**
    * Return the URLs used for this source.
    * When a tileUrlFunction is used instead of url or urls,
    * null will be returned.
    * @return URLs.
    * @api
    */
  def getUrls(): js.Array[String] = js.native
  
  /**
    * Set the tile load function of the source.
    * @param tileLoadFunction Tile load function.
    * @api
    */
  def setTileLoadFunction(tileLoadFunction: TileLoadFunctionType): Unit = js.native
  
  /**
    * Set the tile URL function of the source.
    * @param tileUrlFunction Tile URL function.
    * @param opt_key Optional new tile key for the source.
    * @api
    */
  def setTileUrlFunction(tileUrlFunction: TileUrlFunctionType): Unit = js.native
  def setTileUrlFunction(tileUrlFunction: TileUrlFunctionType, opt_key: String): Unit = js.native
  
  /**
    * Set the URL to use for requests.
    * @param url URL.
    * @api stable
    */
  def setUrl(url: String): Unit = js.native
  
  /**
    * Set the URLs to use for requests.
    * @param urls URLs.
    * @api stable
    */
  def setUrls(urls: js.Array[String]): Unit = js.native
}
