package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inflate extends js.Object {
  var err: scala.Double = js.native
  var msg: java.lang.String = js.native
  var result: Data = js.native
  def onData(chunk: Data): scala.Unit = js.native
  def onEnd(status: scala.Double): scala.Unit = js.native
  def push(data: Data): scala.Boolean = js.native
  def push(data: Data, mode: scala.Boolean): scala.Boolean = js.native
  def push(data: Data, mode: scala.Double): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: scala.Boolean): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: scala.Double): scala.Boolean = js.native
}

