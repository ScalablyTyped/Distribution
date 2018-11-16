package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Encoder extends js.Object {
  var bufferish: js.Any
  var maxBufferSize: scala.Double
  var minBufferSize: scala.Double
  var offset: scala.Double
  var start: scala.Double
  def encode(chunk: js.Any): scala.Unit
  def end(chunk: js.Any): scala.Unit
  def fetch(): scala.Unit
  def flush(): scala.Unit
  def pull(): scala.Double
  def push(chunk: js.Any): scala.Unit
  def read(): scala.Double
  def reserve(length: scala.Double): scala.Double
  def send(buffer: nodeLib.Buffer): scala.Unit
  def write(chunk: js.Any): scala.Unit
}

