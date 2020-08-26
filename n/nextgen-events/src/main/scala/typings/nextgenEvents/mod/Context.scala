package typings.nextgenEvents.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var nice: Double = js.native
  var ready: Boolean = js.native
  var scopes: StringDictionary[js.Any] = js.native
  var serial: Boolean = js.native
  var status: js.Any = js.native
}

object Context {
  @scala.inline
  def apply(nice: Double, ready: Boolean, scopes: StringDictionary[js.Any], serial: Boolean, status: js.Any): Context = {
    val __obj = js.Dynamic.literal(nice = nice.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopes(value: StringDictionary[js.Any]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: Boolean): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

