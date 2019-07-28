package typings.mkdirpDashPromise

import typings.mkdirp.mkdirpMod.Made
import typings.mkdirp.mkdirpMod.Mode
import typings.mkdirp.mkdirpMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp-promise", JSImport.Namespace)
@js.native
object mkdirpDashPromiseMod extends js.Object {
  def apply(path: String): js.Promise[Made] = js.native
  def apply(path: String, opts: Mode | Options): js.Promise[Made] = js.native
}

