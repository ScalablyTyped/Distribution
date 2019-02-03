package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Config")
@js.native
class Config ()
  extends parseLib.nodeMod.Config

/* static members */
@JSImport("parse/react-native", "Config")
@js.native
object Config extends js.Object {
  def current(): parseLib.ParseNs.Config = js.native
  def get(): js.Promise[parseLib.ParseNs.Config] = js.native
  def get(options: parseLib.ParseNs.SuccessFailureOptions): js.Promise[parseLib.ParseNs.Config] = js.native
}

