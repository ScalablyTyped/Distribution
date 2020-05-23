package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwriteModelError
  extends typings.mongoose.mod.Error {
  @JSName("name")
  var name_OverwriteModelError: typings.mongoose.mongooseStrings.OverwriteModelError
}

object OverwriteModelError {
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.OverwriteModelError): OverwriteModelError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteModelError]
  }
}

