package typings.openlayers.mod.interaction

import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.olx.interaction.PointerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Base class that calls user-defined functions on `down`, `move` and `up`
  * events. This class also manages "drag sequences".
  *
  * When the `handleDownEvent` user function returns `true` a drag sequence is
  * started. During a drag sequence the `handleDragEvent` user function is
  * called on `move` events. The drag sequence ends when the `handleUpEvent`
  * user function is called and returns `false`.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "interaction.Pointer")
@js.native
/**
  * @classdesc
  * Base class that calls user-defined functions on `down`, `move` and `up`
  * events. This class also manages "drag sequences".
  *
  * When the `handleDownEvent` user function returns `true` a drag sequence is
  * started. During a drag sequence the `handleDragEvent` user function is
  * called on `move` events. The drag sequence ends when the `handleUpEvent`
  * user function is called and returns `false`.
  *
  * @param opt_options Options.
  * @api
  */
class Pointer () extends Interaction {
  def this(opt_options: PointerOptions) = this()
}
/* static members */
@JSImport("openlayers", "interaction.Pointer")
@js.native
object Pointer extends js.Object {
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
    * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
    * detected.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = js.native
}
