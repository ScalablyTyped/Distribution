package typings
package mergeDashStreamLib.mergeDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedStream
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def add(source: js.Array[nodeLib.NodeJSNs.ReadableStream]): MergedStream = js.native
  def add(source: nodeLib.NodeJSNs.ReadableStream): MergedStream = js.native
  def isEmpty(): scala.Boolean = js.native
}

