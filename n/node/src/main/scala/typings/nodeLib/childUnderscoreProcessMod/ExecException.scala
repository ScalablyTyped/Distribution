package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecException
  extends nodeLib.Error {
  var cmd: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[scala.Double] = js.undefined
  var killed: js.UndefOr[scala.Boolean] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
}

