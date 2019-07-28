package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Config")
@js.native
class Config () extends Object

/* static members */
@JSGlobal("Parse.Config")
@js.native
object Config extends js.Object {
  def current(): Config = js.native
  def get(): js.Promise[Config] = js.native
  def get(options: SuccessFailureOptions): js.Promise[Config] = js.native
  def save(attr: js.Any): js.Promise[Config] = js.native
}

