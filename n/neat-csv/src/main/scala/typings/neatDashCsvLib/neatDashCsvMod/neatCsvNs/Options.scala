package typings
package neatDashCsvLib.neatDashCsvMod.neatCsvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
trait Options extends js.Object {
  var escape: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var mapHeaders: js.UndefOr[
    js.Function1[/* args */ neatDashCsvLib.Anon_Header, java.lang.String | scala.Null]
  ] = js.undefined
  var mapValues: js.UndefOr[js.Function1[/* args */ neatDashCsvLib.Anon_HeaderValue, _]] = js.undefined
  var maxRowBytes: js.UndefOr[scala.Double] = js.undefined
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var skipLines: js.UndefOr[scala.Double] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

