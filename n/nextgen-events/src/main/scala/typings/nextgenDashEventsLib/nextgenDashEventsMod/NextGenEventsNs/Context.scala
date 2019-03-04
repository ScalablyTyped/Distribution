package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var nice: scala.Double
  var ready: scala.Boolean
  var scopes: org.scalablytyped.runtime.StringDictionary[js.Any]
  var serial: scala.Boolean
  var status: js.Any
}

object Context {
  @scala.inline
  def apply(
    nice: scala.Double,
    ready: scala.Boolean,
    scopes: org.scalablytyped.runtime.StringDictionary[js.Any],
    serial: scala.Boolean,
    status: js.Any
  ): Context = {
    val __obj = js.Dynamic.literal(nice = nice, ready = ready, scopes = scopes, serial = serial, status = status)
  
    __obj.asInstanceOf[Context]
  }
}

