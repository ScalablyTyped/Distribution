package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.ExtractIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5`[TSchema /* <: StringDictionary[js.Any] */] extends StObject {
  
  var _id: ExtractIdType[TSchema] = js.native
}
object `5` {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ExtractIdType[TSchema]): `5`[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`[TSchema]]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with `5`[TSchema]) extends AnyVal {
    
    @scala.inline
    def set_id(value: ExtractIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
