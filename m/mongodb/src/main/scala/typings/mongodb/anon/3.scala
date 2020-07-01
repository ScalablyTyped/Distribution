package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3`[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object `3` {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema](_id: ExtractIdType[TSchema]): `3`[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[TSchema]]
  }
}

