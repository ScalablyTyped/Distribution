package typings
package nobleDashMacLib.nobleDashMacMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "Descriptor")
@js.native
class Descriptor ()
  extends nodeLib.eventsMod.EventEmitter {
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_valueRead(
    event: nobleDashMacLib.nobleDashMacLibStrings.valueRead,
    listener: js.Function2[/* error */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_valueWrite(
    event: nobleDashMacLib.nobleDashMacLibStrings.valueWrite,
    listener: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def readValue(): scala.Unit = js.native
  def readValue(callback: js.Function2[/* error */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def writeValue(data: nodeLib.Buffer): scala.Unit = js.native
  def writeValue(data: nodeLib.Buffer, callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

