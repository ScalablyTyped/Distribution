package typings.normalizr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObject[T]
  extends /* key */ StringDictionary[SchemaValue[T]]
     with Schema_[T]

object SchemaObject {
  @scala.inline
  def apply[T](StringDictionary: /* key */ StringDictionary[SchemaValue[T]] = null): SchemaObject[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SchemaObject[T]]
  }
}

