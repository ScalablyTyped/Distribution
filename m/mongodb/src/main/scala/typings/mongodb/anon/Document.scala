package typings.mongodb.anon

import typings.mongodb.mod.OptionalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document[TSchema] extends StObject {
  
  var document: OptionalId[TSchema] = js.native
}
object Document {
  
  @scala.inline
  def apply[TSchema](document: OptionalId[TSchema]): Document[TSchema] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TSchema]]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document[_], TSchema] (val x: Self with Document[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDocument(value: OptionalId[TSchema]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
