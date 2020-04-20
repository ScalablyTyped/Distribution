package typings.nodeFetch.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.nodeFetch.AnonSize
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body () extends js.Object {
  def this(body: js.Any) = this()
  def this(body: js.Any, opts: AnonSize) = this()
  var body: ReadableStream = js.native
  var bodyUsed: Boolean = js.native
  var size: Double = js.native
  var timeout: Double = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def buffer(): js.Promise[Buffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
  def textConverted(): js.Promise[String] = js.native
}

