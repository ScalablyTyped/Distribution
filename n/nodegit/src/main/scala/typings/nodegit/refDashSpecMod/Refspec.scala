package typings.nodegit.refDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-spec", "Refspec")
@js.native
class Refspec () extends js.Object {
  def direction(): Double = js.native
  def dst(): String = js.native
  def dstMatches(refname: String): Double = js.native
  def force(): Double = js.native
  def src(): String = js.native
  def srcMatches(refname: String): Double = js.native
}

