package typings
package olLib.interactionPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("ol/interaction/pointer", JSImport.Default)
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
class default ()
  extends openlayersLib.openlayersMod.interactionNs.Pointer {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PointerOptions) = this()
}

/* static members */
@JSImport("ol/interaction/pointer", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
    * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
    * detected.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
}

