package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NockDefinition extends js.Object {
  var body: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var path: java.lang.String
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var reqheaders: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | nockLib.Anon_HeaderValue]
  ] = js.undefined
  var response: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var scope: java.lang.String
  var status: js.UndefOr[scala.Double] = js.undefined
}

