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
  var size: scala.Double = js.native
  var timeout: scala.Double = js.native
  def arrayBuffer(): js.Promise[stdLib.ArrayBuffer] = js.native
  def blob(): js.Promise[nodeLib.Buffer] = js.native
  def buffer(): js.Promise[nodeLib.Buffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[java.lang.String] = js.native
  def textConverted(): js.Promise[java.lang.String] = js.native
}

