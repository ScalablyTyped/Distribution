package typings.openlayers.openlayersMod.layer

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.olx.layer.GroupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A {@link ol.Collection} of layers that are handled together.
  *
  * A generic `change` event is triggered when the group/Collection changes.
  *
  * @param opt_options Layer options.
  * @api stable
  */
@JSImport("openlayers", "layer.Group")
@js.native
/**
  * @classdesc
  * A {@link ol.Collection} of layers that are handled together.
  *
  * A generic `change` event is triggered when the group/Collection changes.
  *
  * @param opt_options Layer options.
  * @api stable
  */
class Group () extends Base {
  def this(opt_options: GroupOptions) = this()
  /**
    * Returns the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
    * in this group.
    * @return Collection of
    *   {@link ol.layer.Base layers} that are part of this group.
    * @observable
    * @api stable
    */
  def getLayers(): Collection[Base] = js.native
  /**
    * Set the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
    * in this group.
    * @param layers Collection of
    *   {@link ol.layer.Base layers} that are part of this group.
    * @observable
    * @api stable
    */
  def setLayers(layers: Collection[Base]): Unit = js.native
}

