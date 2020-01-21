package typings.nextgenEvents.mod

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
    val __obj = js.Dynamic.literal(nice = nice.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

