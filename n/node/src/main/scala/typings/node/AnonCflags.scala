package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCflags extends js.Object {
  var cflags: js.Array[_]
  var default_configuration: java.lang.String
  var defines: js.Array[java.lang.String]
  var include_dirs: js.Array[java.lang.String]
  var libraries: js.Array[java.lang.String]
}

object AnonCflags {
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: java.lang.String,
    defines: js.Array[java.lang.String],
    include_dirs: js.Array[java.lang.String],
    libraries: js.Array[java.lang.String]
  ): AnonCflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCflags]
  }
}

