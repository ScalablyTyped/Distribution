package typings
package nodegitLib.odbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb", "Odb")
@js.native
class Odb () extends js.Object {
  def addDiskAlternate(path: java.lang.String): scala.Double = js.native
  def expandIds(ids: nodegitLib.odbDashExpandDashIdMod.OdbExpandId, count: scala.Double): scala.Double = js.native
  def free(): scala.Unit = js.native
  def read(id: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.odbDashObjectMod.OdbObject] = js.native
  def write(data: nodeLib.Buffer, len: scala.Double, `type`: nodegitLib.objectMod.ObjectNs.TYPE): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
}

@JSImport("nodegit/odb", "Odb")
@js.native
object Odb extends js.Object {
  def open(objectsDir: java.lang.String): stdLib.Promise[nodegitLib.odbMod.Odb] = js.native
}

