package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelSaveError
  extends typings.mongoose.mod.Error {
  @JSName("name")
  var name_ParallelSaveError: typings.mongoose.mongooseStrings.ParallelSaveError
}

object ParallelSaveError {
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.ParallelSaveError): ParallelSaveError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelSaveError]
  }
}

