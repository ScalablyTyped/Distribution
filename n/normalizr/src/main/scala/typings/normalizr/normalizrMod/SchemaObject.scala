package typings.normalizr.normalizrMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObject[T]
  extends /* key */ StringDictionary[Schema[T]]
     with Schema[T]

object SchemaObject {
  @scala.inline
  def apply[T](StringDictionary: /* key */ StringDictionary[Schema[T]] = null): SchemaObject[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SchemaObject[T]]
  }
}

