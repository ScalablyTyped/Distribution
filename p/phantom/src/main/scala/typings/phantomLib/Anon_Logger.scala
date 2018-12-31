package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logLevel: js.UndefOr[
    phantomLib.phantomLibStrings.debug | phantomLib.phantomLibStrings.info | phantomLib.phantomLibStrings.warn | phantomLib.phantomLibStrings.error
  ] = js.undefined
  var logger: js.UndefOr[Anon_Warn] = js.undefined
  var phantomPath: js.UndefOr[java.lang.String] = js.undefined
  var shimPath: js.UndefOr[java.lang.String] = js.undefined
}

