package typings.parse.reactDashNativeMod

import typings.parse.ParseNs.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Config")
@js.native
class Config ()
  extends typings.parse.nodeMod.Config

/* static members */
@JSImport("parse/react-native", "Config")
@js.native
object Config extends js.Object {
  def current(): typings.parse.ParseNs.Config = js.native
  def get(): js.Promise[typings.parse.ParseNs.Config] = js.native
  def get(options: SuccessFailureOptions): js.Promise[typings.parse.ParseNs.Config] = js.native
  def save(attr: js.Any): js.Promise[typings.parse.ParseNs.Config] = js.native
}

