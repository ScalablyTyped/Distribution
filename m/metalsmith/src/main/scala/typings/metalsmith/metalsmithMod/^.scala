package typings.metalsmith.metalsmithMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("metalsmith", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Initialize a new `Metalsmith` builder with a working `directory`.
    * @param directory  - The working directory.
    * @example
    * initialize Metalsmith with the node.js working directory
    * Metalsmith(__dirname);
    * @link [Metalsmith] http://www.metalsmith.io/
    * @link [API] https://github.com/segmentio/metalsmith#new-metalsmithdir
    * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L30
    */
  def apply(directory: String): Metalsmith = js.native
}

