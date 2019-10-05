package typings.nodeDashRal.nodeDashRalMod

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashRal.nodeDashRalMod.RAL.NormalizerManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var normalizerManager: NormalizerManager = js.native
  def clearConf(): Unit = js.native
  def disableUpdate(): Unit = js.native
  def enableUpdate(interval: Double, all: Boolean, cb: js.Function2[/* err */ js.Any, /* confs */ js.Any, _]): Unit = js.native
  def getConf(name: String): Service = js.native
  def getConfNames(): js.Array[String] = js.native
  def getContext(serviceID: String): Service = js.native
  def getContext(serviceID: String, options: Service): Service = js.native
  def getRawConf(): js.Any = js.native
  def getUpdateNeededRawConf(): js.Any = js.native
  def isAutoUpdateEnabled(): Boolean = js.native
  def load(confPath: String): js.Object = js.native
  def loadRawConf(): Service = js.native
  def loadRawConf(config: Service): Service = js.native
  def normalize(): js.Object = js.native
  def normalize(config: Service): js.Object = js.native
}

@JSImport("node-ral", "Config")
@js.native
object Config extends TopLevel[Config]

