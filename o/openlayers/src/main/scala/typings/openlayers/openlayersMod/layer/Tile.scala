package typings.openlayers.openlayersMod.layer

import typings.openlayers.openlayersMod.olx.layer.TileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * For layer sources that provide pre-rendered, tiled images in grids that are
  * organized by zoom levels for specific resolutions.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Tile layer options.
  * @api stable
  */
@JSImport("openlayers", "layer.Tile")
@js.native
/**
  * @classdesc
  * For layer sources that provide pre-rendered, tiled images in grids that are
  * organized by zoom levels for specific resolutions.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Tile layer options.
  * @api stable
  */
class Tile () extends Layer {
  def this(opt_options: TileOptions) = this()
  /**
    * Return the level as number to which we will preload tiles up to.
    * @return The level to preload tiles up to.
    * @observable
    * @api
    */
  def getPreload(): Double = js.native
  /**
    * Whether we use interim tiles on error.
    * @return Use interim tiles on error.
    * @observable
    * @api
    */
  def getUseInterimTilesOnError(): Boolean = js.native
  /**
    * Set the level as number to which we will preload tiles up to.
    * @param preload The level to preload tiles up to.
    * @observable
    * @api
    */
  def setPreload(preload: Double): Unit = js.native
  /**
    * Set whether we use interim tiles on error.
    * @param useInterimTilesOnError Use interim tiles on error.
    * @observable
    * @api
    */
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
}

