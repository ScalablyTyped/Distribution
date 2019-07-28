package typings.nodeDashPersist.nodeDashPersistMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(): Promise[_] = js.native
  def clear(callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
  def clearSync(): Unit = js.native
  def forEach(callback: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  def getItem(key: String): Promise[_] = js.native
  def getItem(key: String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, _]): Promise[_] = js.native
  def getItemSync(key: String): js.Any = js.native
  def init(): Promise[_] = js.native
  def init(options: InitOptions): Promise[_] = js.native
  def init(options: InitOptions, callback: js.Function): Promise[_] = js.native
  def initSync(): Unit = js.native
  def initSync(options: InitOptions): Unit = js.native
  def keys(): js.Array[String] = js.native
  def length(): Double = js.native
  def persist(): Promise[_] = js.native
  def persist(callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
  def persistKey(key: String): Promise[_] = js.native
  def persistKey(key: String, callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
  def persistKeySync(key: String): Unit = js.native
  def persistSync(): Unit = js.native
  def removeItem(key: String): Promise[_] = js.native
  def removeItem(key: String, callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
  def removeItemSync(key: String): Unit = js.native
  def setItem(key: String, value: js.Any): Promise[_] = js.native
  def setItem(key: String, value: js.Any, callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
  def setItemSync(key: String, value: js.Any): Unit = js.native
  def values(): js.Array[_] = js.native
  def valuesWithKeyMatch(`match`: String): js.Array[_] = js.native
}

