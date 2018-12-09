package typings
package nodegitLib.odbDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb-object", "OdbObject")
@js.native
class OdbObject () extends js.Object {
  def data(): nodeLib.Buffer = js.native
  def dup(): js.Promise[OdbObject] = js.native
  def free(): scala.Unit = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def size(): scala.Double = js.native
  def `type`(): scala.Double = js.native
}

