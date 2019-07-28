package typings.ngstorage.ngstorageMod.ngStorageNs

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageProvider extends IServiceProvider {
  def get[T](key: String): T | Boolean
  def remove(key: String): Unit
  def set[T](key: String, value: T): T | Boolean
  def setDeserializer(deserializer: js.Function1[/* value */ String, _]): Unit
  def setKeyPrefix(prefix: String): Unit
  def setSerializer(serializer: js.Function1[/* value */ js.Any, String]): Unit
  def supported(): Boolean
}

object StorageProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    get: String => js.Any | Boolean,
    remove: String => Unit,
    set: (String, js.Any) => js.Any | Boolean,
    setDeserializer: js.Function1[/* value */ String, _] => Unit,
    setKeyPrefix: String => Unit,
    setSerializer: js.Function1[/* value */ js.Any, String] => Unit,
    supported: () => Boolean
  ): StorageProvider = {
    val __obj = js.Dynamic.literal($get = $get, get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
  
    __obj.asInstanceOf[StorageProvider]
  }
}

