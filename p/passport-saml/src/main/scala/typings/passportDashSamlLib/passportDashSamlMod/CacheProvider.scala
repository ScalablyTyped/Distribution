package typings
package passportDashSamlLib.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheProvider extends js.Object {
  def get(
    key: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit | scala.Null]
  ): scala.Unit = js.native
  def remove(
    key: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* key */ java.lang.String, 
      scala.Unit | scala.Null
    ]
  ): scala.Unit = js.native
  def save(
    key: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* cacheItem */ CacheItem, 
      scala.Unit | scala.Null
    ]
  ): scala.Unit = js.native
  def save(
    key: scala.Null,
    value: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* cacheItem */ CacheItem, 
      scala.Unit | scala.Null
    ]
  ): scala.Unit = js.native
}

