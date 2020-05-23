package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingSchemaError
  extends typings.mongoose.mod.Error {
  @JSName("name")
  var name_MissingSchemaError: typings.mongoose.mongooseStrings.MissingSchemaError
}

object MissingSchemaError {
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.MissingSchemaError): MissingSchemaError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingSchemaError]
  }
}

