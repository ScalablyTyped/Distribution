package typings.nodegit.diffMod

import typings.nodegit.bufMod.Buf
import typings.nodegit.convenientDashPatchMod.ConvenientPatch
import typings.nodegit.diffDashDeltaMod.DiffDelta
import typings.nodegit.diffDashPerfDashDataMod.DiffPerfdata
import typings.nodegit.diffMod.Diff.FORMAT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
class Diff_ () extends js.Object {
  def findSimilar(): js.Promise[Double] = js.native
  def findSimilar(options: DiffFindOptions): js.Promise[Double] = js.native
  def getDelta(idx: Double): DiffDelta = js.native
  def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  def merge(from: Diff): js.Promise[Double] = js.native
  def numDeltas(): Double = js.native
  /**
    * Retrieve patches in this difflist
    *
    *
    */
  def patches(): js.Promise[js.Array[ConvenientPatch]] = js.native
  def toBuf(format: FORMAT): js.Promise[Buf] = js.native
}

