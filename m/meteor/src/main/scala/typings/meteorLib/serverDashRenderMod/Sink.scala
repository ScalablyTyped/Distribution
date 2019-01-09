package typings
package meteorLib.serverDashRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ java.lang.String, scala.Unit]] = js.undefined
  var appendToElementById: js.UndefOr[js.Function2[/* id */ java.lang.String, /* html */ java.lang.String, scala.Unit]] = js.undefined
  var appendToHead: js.UndefOr[js.Function1[/* html */ java.lang.String, scala.Unit]] = js.undefined
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var head: js.UndefOr[java.lang.String] = js.undefined
  var htmlById: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var maybeMadeChanges: js.UndefOr[scala.Boolean] = js.undefined
  var renderIntoElementById: js.UndefOr[
    (js.Function2[/* id */ java.lang.String, /* html */ java.lang.String, scala.Unit]) with (js.Function2[/* id */ java.lang.String, /* html */ nodeLib.NodeJSNs.ReadableStream, scala.Unit])
  ] = js.undefined
  var request: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
}

