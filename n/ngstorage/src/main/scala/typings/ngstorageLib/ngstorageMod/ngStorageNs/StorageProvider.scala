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

