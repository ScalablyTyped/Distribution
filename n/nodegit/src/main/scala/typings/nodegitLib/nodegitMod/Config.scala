package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends nodegitLib.configMod.Config

/* static members */
@JSImport("nodegit", "Config")
@js.native
object Config extends js.Object {
  def findProgramdata(): js.Promise[nodegitLib.bufMod.Buf] = js.native
  def openDefault(): js.Promise[nodegitLib.configMod.Config] = js.native
}

