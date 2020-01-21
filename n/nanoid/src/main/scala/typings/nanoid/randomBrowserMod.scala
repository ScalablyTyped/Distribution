package typings.nanoid

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/async/random-browser", JSImport.Namespace)
@js.native
object randomBrowserMod extends js.Object {
  def apply(bytes: Double): js.Promise[Uint8Array] = js.native
}

