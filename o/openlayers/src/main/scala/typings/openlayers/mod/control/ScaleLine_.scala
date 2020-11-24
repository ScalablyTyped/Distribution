package typings.openlayers.mod.control

import typings.openlayers.mod.control.ScaleLine.Units
import typings.openlayers.mod.olx.control.ScaleLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * A control displaying rough y-axis distances, calculated for the center of the
  * viewport. For conformal projections (e.g. EPSG:3857, the default view
  * projection in OpenLayers), the scale is valid for all directions.
  * No scale line will be shown when the y-axis distance of a pixel at the
  * viewport center cannot be calculated in the view projection.
  * By default the scale line will show in the bottom left portion of the map,
  * but this can be changed by using the css selector `.ol-scale-line`.
  *
  * @param opt_options Scale line options.
  * @api stable
  */
@JSImport("openlayers", "control.ScaleLine")
@js.native
/**
  * @classdesc
  * A control displaying rough y-axis distances, calculated for the center of the
  * viewport. For conformal projections (e.g. EPSG:3857, the default view
  * projection in OpenLayers), the scale is valid for all directions.
  * No scale line will be shown when the y-axis distance of a pixel at the
  * viewport center cannot be calculated in the view projection.
  * By default the scale line will show in the bottom left portion of the map,
  * but this can be changed by using the css selector `.ol-scale-line`.
  *
  * @param opt_options Scale line options.
  * @api stable
  */
class ScaleLine_ () extends Control {
  def this(opt_options: ScaleLineOptions) = this()
  
  /**
    * Return the units to use in the scale line.
    * @return The units to use in the scale
    *     line.
    * @observable
    * @api stable
    */
  def getUnits(): Units = js.native
  
  /**
    * Set the units to use in the scale line.
    * @param units The units to use in the scale line.
    * @observable
    * @api stable
    */
  def setUnits(units: Units): Unit = js.native
}
