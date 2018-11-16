package typings
package nodegitLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/config", "Config")
@js.native
class Config () extends js.Object {
  def getStringBuf(name: java.lang.String): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
  def lock(transaction: js.Any): scala.Double = js.native
  def setInt64(name: java.lang.String, value: scala.Double): scala.Double = js.native
  def setMultivar(name: java.lang.String, regexp: java.lang.String, value: java.lang.String): scala.Double = js.native
  def setString(name: java.lang.String, value: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def snapshot(): stdLib.Promise[Config] = js.native
}

@JSImport("nodegit/config", "Config")
@js.native
object Config extends js.Object {
  def findProgramdata(): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
  def openDefault(): stdLib.Promise[nodegitLib.configMod.Config] = js.native
}

