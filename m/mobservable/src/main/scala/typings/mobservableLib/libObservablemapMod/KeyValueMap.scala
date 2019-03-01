package typings
package mobservableLib.libObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueMap[V]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[V]

object KeyValueMap {
  @scala.inline
  def apply[V](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[V] = null): KeyValueMap[V] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KeyValueMap[V]]
  }
}

