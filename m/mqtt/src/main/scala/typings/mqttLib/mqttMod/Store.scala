package typings
package mqttLib.mqttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * In-memory implementation of the message store
 * This can actually be saved into files.
 *
 */
@JSImport("mqtt", "Store")
@js.native
class Store protected ()
  extends mqttLib.typesLibStoreMod.Store {
  /**
     * Store constructor
     *
     * @param {Object} [options] - store options
     */
  def this(options: mqttLib.typesLibStoreDashOptionsMod.IStoreOptions) = this()
}

