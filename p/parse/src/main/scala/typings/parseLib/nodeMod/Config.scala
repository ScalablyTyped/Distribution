package typings
package parseLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Config")
@js.native
class Config ()
  extends parseLib.ParseNs.Config

/* static members */
@JSImport("parse/node", "Config")
@js.native
object Config extends js.Object {
  def current(): parseLib.ParseNs.Config = js.native
  def get(): js.Promise[parseLib.ParseNs.Config] = js.native
  def get(options: parseLib.ParseNs.SuccessFailureOptions): js.Promise[parseLib.ParseNs.Config] = js.native
  def save(attr: js.Any): js.Promise[parseLib.ParseNs.Config] = js.native
}

