package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Interfaces
   */

trait MapEventListener extends js.Object {
  var eventName: java.lang.String
  var listenerId: java.lang.String
  var target: js.Any
  def listener(event: js.Any): js.Any
}

