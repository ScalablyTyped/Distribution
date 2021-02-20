package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.olx.source.TileArcGISRestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for tile data from ArcGIS Rest services. Map and Image
  * Services are supported.
  *
  * For cached ArcGIS services, better performance is available using the
  * {@link ol.source.XYZ} data source.
  *
  * @param opt_options Tile ArcGIS Rest
  *     options.
  * @api
  */
@JSImport("openlayers", "source.TileArcGISRest")
@js.native
/**
  * @classdesc
  * Layer source for tile data from ArcGIS Rest services. Map and Image
  * Services are supported.
  *
  * For cached ArcGIS services, better performance is available using the
  * {@link ol.source.XYZ} data source.
  *
  * @param opt_options Tile ArcGIS Rest
  *     options.
  * @api
  */
class TileArcGISRest () extends TileImage {
  def this(opt_options: TileArcGISRestOptions) = this()
  
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    * @return Params.
    * @api
    */
  def getParams(): GlobalObject = js.native
  
  /**
    * Update the user-provided params.
    * @param params Params.
    * @api stable
    */
  def updateParams(params: GlobalObject): Unit = js.native
}
