package typings.parse.parseMod

import typings.parse.Parse.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Config")
@js.native
class Config[T /* <: js.Any */] ()
  extends typings.parse.nodeMod.Config[T]

/* static members */
@JSImport("parse", "Config")
@js.native
object Config extends js.Object {
  def current(): typings.parse.Parse.Config[_] = js.native
  def get(): js.Promise[typings.parse.Parse.Config[_]] = js.native
  def get(options: SuccessFailureOptions): js.Promise[typings.parse.Parse.Config[_]] = js.native
  def save(attr: js.Any): js.Promise[typings.parse.Parse.Config[_]] = js.native
}

