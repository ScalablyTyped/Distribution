package typings
package nodegitLib.blameDashHunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame-hunk", "BlameHunk")
@js.native
class BlameHunk () extends js.Object {
  var finalCommitId: nodegitLib.oidMod.Oid = js.native
  var finalSignature: nodegitLib.signatureMod.Signature = js.native
  var finalStartLineNumber: scala.Double = js.native
  var linesInHunk: scala.Double = js.native
  var origCommitId: nodegitLib.oidMod.Oid = js.native
  var origPath: java.lang.String = js.native
  var origSignature: nodegitLib.signatureMod.Signature = js.native
  var origStartLineNumber: scala.Double = js.native
}

