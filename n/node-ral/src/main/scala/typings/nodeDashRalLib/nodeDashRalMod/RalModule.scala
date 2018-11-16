package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "RalModule")
@js.native
abstract class RalModule () extends js.Object {
  def getCategory(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
}

@JSImport("node-ral", "RalModule")
@js.native
object RalModule extends js.Object {
  var modules: ScalablyTyped.runtime.StringDictionary[nodeDashRalLib.nodeDashRalMod.RalModule] = js.native
  def clearCache(): scala.Unit = js.native
  def load(pathOrModule: java.lang.String): scala.Unit = js.native
  def load(pathOrModule: nodeDashRalLib.nodeDashRalMod.RalModule): scala.Unit = js.native
}

