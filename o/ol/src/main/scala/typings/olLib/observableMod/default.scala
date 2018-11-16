package typings
package olLib.observableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/observable", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.Observable

@JSImport("ol/observable", JSImport.Default)
@js.native
object default extends js.Object {
  /**
       * Removes an event listener using the key returned by `on()` or `once()`.
       * @param key The key returned by `on()`
       *     or `once()` (or an array of keys).
       * @api stable
       */
  def unByKey(key: js.Array[openlayersLib.openlayersMod.EventsKey]): scala.Unit = js.native
  /**
       * Removes an event listener using the key returned by `on()` or `once()`.
       * @param key The key returned by `on()`
       *     or `once()` (or an array of keys).
       * @api stable
       */
  def unByKey(key: openlayersLib.openlayersMod.EventsKey): scala.Unit = js.native
}

