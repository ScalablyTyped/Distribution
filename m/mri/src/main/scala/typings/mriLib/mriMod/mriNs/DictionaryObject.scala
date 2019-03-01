package typings
package mriLib.mriMod.mriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object with any keys whose values conform to a specific type */
trait DictionaryObject[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object DictionaryObject {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): DictionaryObject[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictionaryObject[T]]
  }
}

