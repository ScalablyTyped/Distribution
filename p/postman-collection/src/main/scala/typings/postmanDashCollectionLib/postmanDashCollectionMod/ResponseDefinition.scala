package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseDefinition extends PropertyDefinition {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var code: scala.Double
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.undefined
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var originalRequest: js.UndefOr[RequestDefinition] = js.undefined
  var responseTime: scala.Double
  var stream: js.UndefOr[nodeLib.Buffer | stdLib.Uint8Array] = js.undefined
}

