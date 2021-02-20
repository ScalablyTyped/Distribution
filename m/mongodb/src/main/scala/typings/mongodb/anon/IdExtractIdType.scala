package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdExtractIdType[TSchema] extends StObject {
  
  var _id: ExtractIdType[TSchema] = js.native
}
object IdExtractIdType {
  
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): IdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdExtractIdType[TSchema]]
  }
  
  @scala.inline
  implicit class IdExtractIdTypeMutableBuilder[Self <: IdExtractIdType[_], TSchema] (val x: Self with IdExtractIdType[TSchema]) extends AnyVal {
    
    @scala.inline
    def set_id(value: ExtractIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
