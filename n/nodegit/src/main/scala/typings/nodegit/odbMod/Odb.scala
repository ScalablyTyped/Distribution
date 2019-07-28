package typings.nodegit.odbMod

import typings.node.Buffer
import typings.nodegit.objectMod.ObjectNs.TYPE
import typings.nodegit.odbDashExpandDashIdMod.OdbExpandId
import typings.nodegit.odbDashObjectMod.OdbObject
import typings.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb", "Odb")
@js.native
class Odb () extends js.Object {
  def addDiskAlternate(path: String): Double = js.native
  def expandIds(ids: OdbExpandId, count: Double): Double = js.native
  def free(): Unit = js.native
  def read(id: Oid): js.Promise[OdbObject] = js.native
  def write(data: Buffer, len: Double, `type`: TYPE): js.Promise[Oid] = js.native
}

/* static members */
@JSImport("nodegit/odb", "Odb")
@js.native
object Odb extends js.Object {
  def open(objectsDir: String): js.Promise[Odb] = js.native
}

