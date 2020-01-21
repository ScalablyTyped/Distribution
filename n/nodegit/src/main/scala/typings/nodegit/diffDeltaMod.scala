package typings.nodegit

import typings.nodegit.diffFileMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-delta", JSImport.Namespace)
@js.native
object diffDeltaMod extends js.Object {
  @js.native
  class DiffDelta () extends js.Object {
    def flags(): Double = js.native
    def newFile(): DiffFile = js.native
    def nfiles(): Double = js.native
    def oldFile(): DiffFile = js.native
    def similarity(): Double = js.native
    def status(): Double = js.native
  }
  
}

