package typings.pgPromise.mod

import typings.pgPromise.AnonCndModeTag
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskArguments[T] extends IArguments {
  var options: AnonCndModeTag with T = js.native
  def cb(): js.Any = js.native
}

