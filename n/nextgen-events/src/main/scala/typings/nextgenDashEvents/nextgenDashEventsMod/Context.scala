package typings.nextgenDashEvents.nextgenDashEventsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var nice: Double
  var ready: Boolean
  var scopes: StringDictionary[js.Any]
  var serial: Boolean
  var status: js.Any
}

object Context {
  @scala.inline
  def apply(nice: Double, ready: Boolean, scopes: StringDictionary[js.Any], serial: Boolean, status: js.Any): Context = {
    val __obj = js.Dynamic.literal(nice = nice, ready = ready, scopes = scopes, serial = serial, status = status)
  
    __obj.asInstanceOf[Context]
  }
}

