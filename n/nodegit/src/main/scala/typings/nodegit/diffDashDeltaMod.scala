package typings.nodegit

import typings.nodegit.diffDashFileMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-delta", JSImport.Namespace)
@js.native
object diffDashDeltaMod extends js.Object {
  @js.native
  class DiffDelta () extends js.Object {
    var flags: Double = js.native
    var newFile: DiffFile = js.native
    var nfiles: Double = js.native
    var oldFile: DiffFile = js.native
    var similarity: Double = js.native
    var status: Double = js.native
  }
  
}

