package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "RAL")
@js.native
object RALNs extends js.Object {
  @js.native
  class NormalizerManager () extends js.Object {
    var normalizers: js.Array[java.lang.String] = js.native
    @JSName("apply")
    def apply(config: js.Object): js.Object = js.native
    def needUpdate(config: js.Any): scala.Boolean = js.native
    def setConfigNormalizer(normalizers: js.Array[java.lang.String]): scala.Unit = js.native
  }
  
  @js.native
  class RalRunner protected ()
    extends nodeLib.eventsMod.EventEmitter {
    def this(serviceName: java.lang.String) = this()
    def this(serviceName: java.lang.String, options: js.Object) = this()
    def callRetry(err: js.Any): scala.Unit = js.native
    def doRequest(): scala.Unit = js.native
    def getLogInfo(): nodeDashRalLib.nodeDashRalMod.LogInfo = js.native
    def throwError(err: js.Any): scala.Unit = js.native
  }
  
  def appendExtPath(extPath: java.lang.String): scala.Unit = js.native
  def getConf(name: java.lang.String): nodeDashRalLib.nodeDashRalMod.Config = js.native
  def getRawConf(name: java.lang.String): nodeDashRalLib.nodeDashRalMod.Config = js.native
  def init(): scala.Unit = js.native
  def init(options: js.Object): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reload(options: js.Object): scala.Unit = js.native
  def setConfigNormalizer(normalizers: nodeDashRalLib.nodeDashRalMod.ConfigNormalizer): scala.Unit = js.native
}

