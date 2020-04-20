package typings.ngstorage.mod.ngStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait StorageProvider extends js.Object {
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
    get: String => js.Any | Boolean,
    remove: String => Unit,
    set: (String, js.Any) => js.Any | Boolean,
    setDeserializer: js.Function1[/* value */ String, _] => Unit,
    setKeyPrefix: String => Unit,
    setSerializer: js.Function1[/* value */ js.Any, String] => Unit,
    supported: () => Boolean
  ): StorageProvider = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
    __obj.asInstanceOf[StorageProvider]
  }
}

