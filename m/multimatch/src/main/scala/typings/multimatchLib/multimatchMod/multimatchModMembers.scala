package typings
package multimatchLib.multimatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multimatch", JSImport.Namespace)
@js.native
object multimatchModMembers extends js.Object {
  /**
    * Match utility function which supports multiple pattern globbing.
    *
    * @param paths paths to match against.
    * @param patterns globbing patterns to use. e.g. `[*, "!cake"]`.
    */
  def apply(
    paths: java.lang.String | js.Array[java.lang.String],
    patterns: java.lang.String | js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def apply(
    paths: java.lang.String | js.Array[java.lang.String],
    patterns: java.lang.String | js.Array[java.lang.String],
    options: multimatchLib.multimatchMod.multimatchNs.MultimatchOptions
  ): js.Array[java.lang.String] = js.native
}

