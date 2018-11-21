package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body () extends js.Object {
  def this(body: js.Any) = this()
  def this(body: js.Any, opts: nodeDashFetchLib.Anon_Size) = this()
  var body: nodeLib.NodeJSNs.ReadableStream = js.native
  var bodyUsed: scala.Boolean = js.native
  def arrayBuffer(): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def blob(): stdLib.Promise[nodeLib.Buffer] = js.native
  def buffer(): stdLib.Promise[nodeLib.Buffer] = js.native
  def json(): stdLib.Promise[_] = js.native
  def text(): stdLib.Promise[java.lang.String] = js.native
  def textConverted(): stdLib.Promise[java.lang.String] = js.native
}

