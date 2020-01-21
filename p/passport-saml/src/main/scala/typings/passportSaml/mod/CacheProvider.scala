package typings.passportSaml.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheProvider extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit | Null]): Unit = js.native
  def remove(key: String, callback: js.Function2[/* err */ Error | Null, /* key */ String, Unit | Null]): Unit = js.native
  def save(
    key: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error | Null, /* cacheItem */ CacheItem, Unit | Null]
  ): Unit = js.native
  def save(
    key: Null,
    value: js.Any,
    callback: js.Function2[/* err */ Error | Null, /* cacheItem */ CacheItem, Unit | Null]
  ): Unit = js.native
}

