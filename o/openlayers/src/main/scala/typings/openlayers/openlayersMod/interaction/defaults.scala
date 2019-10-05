package typings.openlayers.openlayersMod.interaction

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.olx.interaction.DefaultsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "interaction.defaults")
@js.native
object defaults extends js.Object {
  /**
    * Set of interactions included in maps by default. Specific interactions can be
    * excluded by setting the appropriate option to false in the constructor
    * options, but the order of the interactions is fixed.  If you want to specify
    * a different order for interactions, you will need to create your own
    * {@link ol.interaction.Interaction} instances and insert them into a
    * {@link ol.Collection} in the order you want before creating your
    * {@link ol.Map} instance. The default set of interactions, in sequence, is:
    * * {@link ol.interaction.DragRotate}
    * * {@link ol.interaction.DoubleClickZoom}
    * * {@link ol.interaction.DragPan}
    * * {@link ol.interaction.PinchRotate}
    * * {@link ol.interaction.PinchZoom}
    * * {@link ol.interaction.KeyboardPan}
    * * {@link ol.interaction.KeyboardZoom}
    * * {@link ol.interaction.MouseWheelZoom}
    * * {@link ol.interaction.DragZoom}
    *
    * @param opt_options Defaults options.
    * @return A collection of
    * interactions to be used with the ol.Map constructor's interactions option.
    * @api stable
    */
  def apply(): Collection[Interaction] = js.native
  def apply(opt_options: DefaultsOptions): Collection[Interaction] = js.native
}

