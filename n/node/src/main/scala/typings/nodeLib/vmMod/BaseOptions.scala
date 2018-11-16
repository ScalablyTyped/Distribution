package typings
package nodeLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseOptions extends js.Object {
  /**
           * Specifies the column number offset that is displayed in stack traces produced by this script.
           * Default: `0`
           */
  var columnOffset: js.UndefOr[scala.Double] = js.undefined
  /**
           * Specifies the filename used in stack traces produced by this script.
           * Default: `''`.
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Specifies the line number offset that is displayed in stack traces produced by this script.
           * Default: `0`.
           */
  var lineOffset: js.UndefOr[scala.Double] = js.undefined
}

