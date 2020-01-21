package typings.minimatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimatch", "filter")
@js.native
object filter extends js.Object {
  /**
    * Returns a function that tests its supplied argument, suitable for use with Array.filter
    */
  def apply(pattern: String): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
  def apply(pattern: String, options: IOptions): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
}

