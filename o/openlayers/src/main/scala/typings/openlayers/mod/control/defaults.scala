package typings.openlayers.mod.control

import typings.openlayers.mod.Collection
import typings.openlayers.mod.olx.control.DefaultsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "control.defaults")
@js.native
object defaults extends js.Object {
  /**
    * Set of controls included in maps by default. Unless configured otherwise,
    * this returns a collection containing an instance of each of the following
    * controls:
    * * {@link ol.control.Zoom}
    * * {@link ol.control.Rotate}
    * * {@link ol.control.Attribution}
    *
    * @param opt_options Defaults options.
    * @return Controls.
    * @api stable
    */
  def apply(): Collection[Control] = js.native
  def apply(opt_options: DefaultsOptions): Collection[Control] = js.native
}

