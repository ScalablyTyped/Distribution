package typings
package ngstorageLib.ngstorageMod.ngStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
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
    get: js.Function1[java.lang.String, js.Any | scala.Boolean],
    remove: js.Function1[java.lang.String, scala.Unit],
    set: js.Function2[java.lang.String, js.Any, js.Any | scala.Boolean],
    setDeserializer: js.Function1[js.Function1[/* value */ java.lang.String, _], scala.Unit],
    setKeyPrefix: js.Function1[java.lang.String, scala.Unit],
    setSerializer: js.Function1[js.Function1[/* value */ js.Any, java.lang.String], scala.Unit],
    supported: js.Function0[scala.Boolean]
  ): StorageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("setDeserializer")(setDeserializer)
    __obj.updateDynamic("setKeyPrefix")(setKeyPrefix)
    __obj.updateDynamic("setSerializer")(setSerializer)
    __obj.updateDynamic("supported")(supported)
    __obj.asInstanceOf[StorageProvider]
  }
}

