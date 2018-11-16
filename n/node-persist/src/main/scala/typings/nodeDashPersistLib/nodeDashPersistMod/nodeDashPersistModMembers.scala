package typings
package nodeDashPersistLib.nodeDashPersistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", JSImport.Namespace)
@js.native
object nodeDashPersistModMembers extends js.Object {
  def clear(): qLib.qMod.QNs.Promise[_] = js.native
  def clear(callback: js.Function1[/* err */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def clearSync(): scala.Unit = js.native
  def forEach(callback: js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def getItem(key: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def getItem(key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def getItemSync(key: java.lang.String): js.Any = js.native
  def init(): qLib.qMod.QNs.Promise[_] = js.native
  def init(options: nodeDashPersistLib.nodeDashPersistMod.NodePersistNs.InitOptions): qLib.qMod.QNs.Promise[_] = js.native
  def init(options: nodeDashPersistLib.nodeDashPersistMod.NodePersistNs.InitOptions, callback: js.Function): qLib.qMod.QNs.Promise[_] = js.native
  def initSync(): scala.Unit = js.native
  def initSync(options: nodeDashPersistLib.nodeDashPersistMod.NodePersistNs.InitOptions): scala.Unit = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def length(): scala.Double = js.native
  def persist(): qLib.qMod.QNs.Promise[_] = js.native
  def persist(callback: js.Function1[/* err */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def persistKey(key: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def persistKey(key: java.lang.String, callback: js.Function1[/* err */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def persistKeySync(key: java.lang.String): scala.Unit = js.native
  def persistSync(): scala.Unit = js.native
  def removeItem(key: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def removeItem(key: java.lang.String, callback: js.Function1[/* err */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def removeItemSync(key: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def setItem(key: java.lang.String, value: js.Any, callback: js.Function1[/* err */ js.Any, _]): qLib.qMod.QNs.Promise[_] = js.native
  def setItemSync(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def values(): js.Array[_] = js.native
  def valuesWithKeyMatch(`match`: java.lang.String): js.Array[_] = js.native
}

