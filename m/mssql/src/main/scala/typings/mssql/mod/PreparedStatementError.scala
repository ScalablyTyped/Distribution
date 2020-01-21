package typings.mssql.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "PreparedStatementError")
@js.native
class PreparedStatementError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  var code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

