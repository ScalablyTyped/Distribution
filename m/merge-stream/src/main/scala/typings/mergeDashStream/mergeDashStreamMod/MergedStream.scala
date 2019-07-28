package typings.mergeDashStream.mergeDashStreamMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedStream extends ReadWriteStream {
  def add(source: js.Array[ReadableStream]): MergedStream = js.native
  def add(source: ReadableStream): MergedStream = js.native
  def isEmpty(): Boolean = js.native
}

