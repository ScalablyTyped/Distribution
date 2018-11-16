package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  var onError: js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]] = js.undefined
}

