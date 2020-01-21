package typings.mkdirpPromise

import typings.mkdirp.mod.Made
import typings.mkdirp.mod.Mode
import typings.mkdirp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: String): js.Promise[Made] = js.native
  def apply(path: String, opts: Mode): js.Promise[Made] = js.native
  def apply(path: String, opts: Options): js.Promise[Made] = js.native
}

