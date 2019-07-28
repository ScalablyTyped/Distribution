package typings.parse.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Error")
@js.native
class Error protected ()
  extends typings.parse.nodeMod.Error {
  def this(code: typings.parse.ParseNs.ErrorCode, message: String) = this()
}

