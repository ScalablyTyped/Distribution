package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body ()
  extends nodeDashFetchLib.nodeDashFetchMod.fetchNs.Body {
  def this(body: js.Any) = this()
  def this(body: js.Any, opts: nodeDashFetchLib.Anon_Size) = this()
  /* CompleteClass */
  override var body: nodeLib.NodeJSNs.ReadableStream = js.native
  /* CompleteClass */
  override var bodyUsed: scala.Boolean = js.native
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

