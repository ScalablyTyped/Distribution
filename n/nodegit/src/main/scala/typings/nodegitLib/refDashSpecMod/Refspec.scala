package typings
package nodegitLib.refDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-spec", "Refspec")
@js.native
class Refspec () extends js.Object {
  def direction(): scala.Double = js.native
  def dst(): java.lang.String = js.native
  def dstMatches(refname: java.lang.String): scala.Double = js.native
  def force(): scala.Double = js.native
  def src(): java.lang.String = js.native
  def srcMatches(refname: java.lang.String): scala.Double = js.native
}

