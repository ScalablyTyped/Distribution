package typings
package parseLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Error")
@js.native
class Error protected ()
  extends parseLib.ParseNs.Error {
  def this(code: parseLib.ParseNs.ErrorCode, message: java.lang.String) = this()
}

