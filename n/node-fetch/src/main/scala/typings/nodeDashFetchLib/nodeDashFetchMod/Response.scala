package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Response")
@js.native
class Response ()
  extends nodeDashFetchLib.nodeDashFetchMod.fetchNs.Response {
  def this(body: nodeDashFetchLib.nodeDashFetchMod.fetchNs.BodyInit) = this()
  def this(body: nodeDashFetchLib.nodeDashFetchMod.fetchNs.BodyInit, init: nodeDashFetchLib.nodeDashFetchMod.fetchNs.ResponseInit) = this()
  /* CompleteClass */
  override var body: nodeLib.NodeJSNs.ReadableStream = js.native
  /* CompleteClass */
  override var bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override var headers: nodeDashFetchLib.nodeDashFetchMod.fetchNs.Headers = js.native
  /* CompleteClass */
  override var ok: scala.Boolean = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override var status: scala.Double = js.native
  /* CompleteClass */
  override var statusText: java.lang.String = js.native
  /* CompleteClass */
  override var timeout: scala.Double = js.native
  /* CompleteClass */
  override var `type`: nodeDashFetchLib.nodeDashFetchMod.fetchNs.ResponseType = js.native
  /* CompleteClass */
  override var url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): stdLib.Promise[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override def buffer(): stdLib.Promise[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override def json(): stdLib.Promise[_] = js.native
  /* CompleteClass */
  override def text(): stdLib.Promise[java.lang.String] = js.native
  /* CompleteClass */
  override def textConverted(): stdLib.Promise[java.lang.String] = js.native
}

@JSImport("node-fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): nodeDashFetchLib.nodeDashFetchMod.fetchNs.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): nodeDashFetchLib.nodeDashFetchMod.fetchNs.Response = js.native
}

