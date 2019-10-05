package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame-hunk", JSImport.Namespace)
@js.native
object blameDashHunkMod extends js.Object {
  @js.native
  class BlameHunk () extends js.Object {
    var finalCommitId: Oid = js.native
    var finalSignature: Signature = js.native
    var finalStartLineNumber: Double = js.native
    var linesInHunk: Double = js.native
    var origCommitId: Oid = js.native
    var origPath: String = js.native
    var origSignature: Signature = js.native
    var origStartLineNumber: Double = js.native
  }
  
}

