package typings.parse.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Config")
@js.native
class Config[T /* <: js.Any */] () extends Object[T] {
  def get(attr: String): js.Any = js.native
}

/* static members */
@JSGlobal("Parse.Config")
@js.native
object Config extends js.Object {
  def current(): Config[_] = js.native
  def get(): js.Promise[Config[_]] = js.native
  def get(options: SuccessFailureOptions): js.Promise[Config[_]] = js.native
  def save(attr: js.Any): js.Promise[Config[_]] = js.native
}

