package typings
package nodegitLib.convenientDashHunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/convenient-hunk", "ConvenientHunk")
@js.native
class ConvenientHunk () extends js.Object {
  /**
       * Diff header string that represents the context of this hunk
       * of the diff. Something like `@@ -169,14 +167,12 @@ ...`
       */
  def header(): java.lang.String = js.native
  /**
       * The length of the header
       */
  def headerLen(): scala.Double = js.native
  /**
       * The lines in this hunk
       */
  def lines(): stdLib.Promise[js.Array[nodegitLib.diffDashLineMod.DiffLine]] = js.native
  /**
       * The number of new lines in the hunk
       */
  def newLines(): scala.Double = js.native
  /**
       * The starting offset of the first new line in the file
       */
  def newStart(): scala.Double = js.native
  /**
       * The number of old lines in the hunk
       */
  def oldLines(): scala.Double = js.native
  /**
       * The starting offset of the first old line in the file
       */
  def oldStart(): scala.Double = js.native
  /**
       * Number of lines in this hunk
       */
  def size(): scala.Double = js.native
}

