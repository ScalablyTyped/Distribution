package typings.openlayers.openlayersMod.layer

import typings.openlayers.openlayersMod.olx.layer.VectorTileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer for vector tile data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "layer.VectorTile")
@js.native
/**
  * @classdesc
  * Layer for vector tile data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @param opt_options Options.
  * @api
  */
class VectorTile () extends Vector {
  def this(opt_options: VectorTileOptions) = this()
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

