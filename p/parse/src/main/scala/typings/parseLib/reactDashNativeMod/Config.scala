package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Config")
@js.native
class Config ()
  extends parseLib.nodeMod.Config

@JSImport("parse/react-native", "Config")
@js.native
object Config extends js.Object {
  def current(): parseLib.ParseNs.Config = js.native
  def get(): stdLib.Promise[parseLib.ParseNs.Config] = js.native
  def get(options: parseLib.ParseNs.SuccessFailureOptions): stdLib.Promise[parseLib.ParseNs.Config] = js.native
}

