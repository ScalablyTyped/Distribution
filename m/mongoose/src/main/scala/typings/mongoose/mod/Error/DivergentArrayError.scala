package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivergentArrayError
  extends typings.mongoose.mod.Error {
  @JSName("name")
  var name_DivergentArrayError: typings.mongoose.mongooseStrings.DivergentArrayError
}

object DivergentArrayError {
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.DivergentArrayError): DivergentArrayError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivergentArrayError]
  }
}

