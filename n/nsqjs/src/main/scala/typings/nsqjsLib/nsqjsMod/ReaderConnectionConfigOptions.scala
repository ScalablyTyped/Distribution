package typings
package nsqjsLib.nsqjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReaderConnectionConfigOptions extends ConnectionConfigOptions {
  var lookupdHTTPAddresses: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var lookupdPollInterval: js.UndefOr[scala.Double] = js.undefined
  var lookupdPollJitter: js.UndefOr[scala.Double] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxBackoffDuration: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nsqdTCPAddresses: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

