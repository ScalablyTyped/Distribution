package typings.mqtt.typesLibStoreMod

import typings.mqtt.typesLibStoreDashOptionsMod.IStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In-memory implementation of the message store
  * This can actually be saved into files.
  *
  */
@JSImport("mqtt/types/lib/store", "Store")
@js.native
class Store protected () extends js.Object {
  /**
    * Store constructor
    *
    * @param {Object} [options] - store options
    */
  def this(options: IStoreOptions) = this()
  /**
    * Close the store
    */
  def close(cb: js.Function): Unit = js.native
  /**
    * Creates a stream with all the packets in the store
    *
    */
  def createStream(): js.Any = js.native
  /**
    * deletes a packet from the store.
    */
  def del(packet: js.Any, cb: js.Function): this.type = js.native
  /**
    * get a packet from the store.
    */
  def get(packet: js.Any, cb: js.Function): this.type = js.native
  /**
    * Adds a packet to the store, a packet is
    * anything that has a messageId property.
    *
    */
  def put(packet: js.Any): this.type = js.native
  def put(packet: js.Any, cb: js.Function): this.type = js.native
}

