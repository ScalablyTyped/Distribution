package typings.pigpioDht.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dht extends EventEmitter {
  /**
    * Starts reading the sensor value. Emits the 'start' event before starting,
    * the 'end' event on end whether or not an error occurred, the 'result'
    * event with a DhtResult on success, and the 'badChecksum' event on a
    * receive failure.
    * @returns false if a read is already underway, true if a new read was started.
    */
  def read(): Boolean = js.native
}

