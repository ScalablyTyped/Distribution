package typings
package nodeDashFetchLib.nodeDashFetchMod.fetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Body extends js.Object {
  var body: nodeLib.NodeJSNs.ReadableStream
  var bodyUsed: scala.Boolean
  def arrayBuffer(): stdLib.Promise[stdLib.ArrayBuffer]
  def blob(): stdLib.Promise[nodeLib.Buffer]
  def buffer(): stdLib.Promise[nodeLib.Buffer]
  def json(): stdLib.Promise[_]
  def text(): stdLib.Promise[java.lang.String]
  def textConverted(): stdLib.Promise[java.lang.String]
}

