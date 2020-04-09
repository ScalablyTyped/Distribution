package typings.mongodb

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdExtractIdType[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object AnonIdExtractIdType {
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ExtractIdType[TSchema]): AnonIdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdExtractIdType[TSchema]]
  }
}

