package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Request")
@js.native
class Request protected ()
  extends nodeDashFetchLib.nodeDashFetchMod.fetchNs.Request {
  def this(input: java.lang.String) = this()
  def this(input: nodeDashFetchLib.Anon_Href) = this()
  def this(input: nodeDashFetchLib.nodeDashFetchMod.fetchNs.Request) = this()
  def this(input: java.lang.String, init: nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestInit) = this()
  def this(input: nodeDashFetchLib.Anon_Href, init: nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestInit) = this()
  def this(input: nodeDashFetchLib.nodeDashFetchMod.fetchNs.Request, init: nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestInit) = this()
  /* CompleteClass */
  override var body: nodeLib.NodeJSNs.ReadableStream = js.native
  /* CompleteClass */
  override var bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override var compress: scala.Boolean = js.native
  /* CompleteClass */
  override var context: nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestContext = js.native
  /* CompleteClass */
  override var counter: scala.Double = js.native
  /* CompleteClass */
  override var follow: scala.Double = js.native
  /* CompleteClass */
  override var headers: nodeDashFetchLib.nodeDashFetchMod.fetchNs.Headers = js.native
  /* CompleteClass */
  override var hostname: java.lang.String = js.native
  /* CompleteClass */
  override var method: java.lang.String = js.native
  /* CompleteClass */
  override var protocol: java.lang.String = js.native
  /* CompleteClass */
  override var redirect: nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestRedirect = js.native
  /* CompleteClass */
  override var referrer: java.lang.String = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override var timeout: scala.Double = js.native
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

