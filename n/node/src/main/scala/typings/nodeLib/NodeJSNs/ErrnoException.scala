package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrnoException
  extends nodeLib.Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errno: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var syscall: js.UndefOr[java.lang.String] = js.undefined
}

