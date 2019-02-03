package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Interaction for selecting vector features. By default, selected features are
  * styled differently, so this interaction can be used for visual highlighting,
  * as well as selecting features for other actions, such as modification or
  * output. There are three ways of controlling which features are selected:
  * using the browser event as defined by the `condition` and optionally the
  * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
  * further feature filter using the `filter` option.
  *
  * Selected features are added to an internal unmanaged layer.
  *
  * @param opt_options Options.
  * @fires ol.interaction.SelectEvent
  * @api stable
  */
@JSImport("ol/interaction/select", JSImport.Default)
@js.native
/**
  * @classdesc
  * Interaction for selecting vector features. By default, selected features are
  * styled differently, so this interaction can be used for visual highlighting,
  * as well as selecting features for other actions, such as modification or
  * output. There are three ways of controlling which features are selected:
  * using the browser event as defined by the `condition` and optionally the
  * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
  * further feature filter using the `filter` option.
  *
  * Selected features are added to an internal unmanaged layer.
  *
  * @param opt_options Options.
  * @fires ol.interaction.SelectEvent
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.Select {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SelectOptions) = this()
}

/* static members */
@JSImport("ol/interaction/select", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
    * selected state of features.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
}

