package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Error")
@js.native
class Error protected ()
  extends parseLib.nodeMod.Error {
  def this(code: parseLib.ParseNs.ErrorCode, message: java.lang.String) = this()
}

