package typings
package nearleyLib.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserRule extends js.Object {
  var name: java.lang.String
  var postprocess: js.UndefOr[Postprocessor] = js.undefined
  var symbols: js.Array[_]
}

