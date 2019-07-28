package typings.mongoose.mongooseMod.ErrorNs

import typings.mongoose.mongooseMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionError extends Error {
  var modifiedPaths: js.Array[_] = js.native
  @JSName("name")
  var name_VersionError: typings.mongoose.mongooseStrings.VersionError = js.native
  var version: js.Any = js.native
}

