package typings
package ngstorageLib.ngstorageMod.ngStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageProvider
  extends angularLib.angularMod.IServiceProvider {
  def get[T](key: java.lang.String): T | scala.Boolean
  def remove(key: java.lang.String): scala.Unit
  def set[T](key: java.lang.String, value: T): T | scala.Boolean
  def setDeserializer(deserializer: js.Function1[/* value */ java.lang.String, _]): scala.Unit
  def setKeyPrefix(prefix: java.lang.String): scala.Unit
  def setSerializer(serializer: js.Function1[/* value */ js.Any, java.lang.String]): scala.Unit
  def supported(): scala.Boolean
}

object StorageProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    get: java.lang.String => js.Any | scala.Boolean,
    remove: java.lang.String => scala.Unit,
    set: (java.lang.String, js.Any) => js.Any | scala.Boolean,
    setDeserializer: js.Function1[/* value */ java.lang.String, _] => scala.Unit,
    setKeyPrefix: java.lang.String => scala.Unit,
    setSerializer: js.Function1[/* value */ js.Any, java.lang.String] => scala.Unit,
    supported: () => scala.Boolean
  ): StorageProvider = {
    val __obj = js.Dynamic.literal($get = $get, get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
  
    __obj.asInstanceOf[StorageProvider]
  }
}

