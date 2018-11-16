package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var normalizerManager: nodeDashRalLib.nodeDashRalMod.RALNs.NormalizerManager = js.native
  def clearConf(): scala.Unit = js.native
  def disableUpdate(): scala.Unit = js.native
  def enableUpdate(
    interval: scala.Double,
    all: scala.Boolean,
    cb: js.Function2[/* err */ js.Any, /* confs */ js.Any, _]
  ): scala.Unit = js.native
  def getConf(name: java.lang.String): Service = js.native
  def getConfNames(): js.Array[java.lang.String] = js.native
  def getContext(serviceID: java.lang.String): Service = js.native
  def getContext(serviceID: java.lang.String, options: Service): Service = js.native
  def getRawConf(): js.Any = js.native
  def getUpdateNeededRawConf(): js.Any = js.native
  def isAutoUpdateEnabled(): scala.Boolean = js.native
  def load(confPath: java.lang.String): js.Object = js.native
  def loadRawConf(): Service = js.native
  def loadRawConf(config: Service): Service = js.native
  def normalize(): js.Object = js.native
  def normalize(config: Service): js.Object = js.native
}

