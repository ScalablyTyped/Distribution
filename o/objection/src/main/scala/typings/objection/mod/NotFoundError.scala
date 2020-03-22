package typings.objection.mod

import typings.objection.objectionStrings.NotFound
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "NotFoundError")
@js.native
class NotFoundError () extends Error {
  def this(data: js.Any) = this()
  var data: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var statusCode: Double = js.native
  var `type`: NotFound = js.native
}

