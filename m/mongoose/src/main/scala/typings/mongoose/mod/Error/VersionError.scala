package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionError
  extends typings.mongoose.mod.Error {
  var modifiedPaths: js.Array[_]
  @JSName("name")
  var name_VersionError: typings.mongoose.mongooseStrings.VersionError
  var version: js.Any
}

object VersionError {
  @scala.inline
  def apply(modifiedPaths: js.Array[_], name: typings.mongoose.mongooseStrings.VersionError, version: js.Any): VersionError = {
    val __obj = js.Dynamic.literal(modifiedPaths = modifiedPaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionError]
  }
}

