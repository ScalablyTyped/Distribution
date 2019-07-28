package typings.nodeDashFetch.nodeDashFetchMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.nodeDashFetch.Anon_Size
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body () extends js.Object {
  def this(body: js.Any) = this()
  def this(body: js.Any, opts: Anon_Size) = this()
  var body: ReadableStream = js.native
  var bodyUsed: Boolean = js.native
  var size: Double = js.native
  var timeout: Double = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Buffer] = js.native
  def buffer(): js.Promise[Buffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
  def textConverted(): js.Promise[String] = js.native
}

