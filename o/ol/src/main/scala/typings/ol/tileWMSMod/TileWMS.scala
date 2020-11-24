package typings.ol.tileWMSMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileWMS
  extends typings.ol.tileImageMod.default {
  
  /**
    * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
    * projection. Return undefined if the GetFeatureInfo URL cannot be
    * constructed.
    */
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): js.UndefOr[String] = js.native
  
  /**
    * Return the GetLegendGraphic URL, optionally optimized for the passed
    * resolution and possibly including any passed specific parameters. Returns
    * undefined if the GetLegendGraphic URL cannot be constructed.
    */
  def getLegendUrl(): js.UndefOr[String] = js.native
  def getLegendUrl(resolution: js.UndefOr[scala.Nothing], params: js.Any): js.UndefOr[String] = js.native
  def getLegendUrl(resolution: Double): js.UndefOr[String] = js.native
  def getLegendUrl(resolution: Double, params: js.Any): js.UndefOr[String] = js.native
  
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    */
  def getParams(): js.Any = js.native
  
  /**
    * Update the user-provided params.
    */
  def updateParams(params: js.Any): Unit = js.native
}
