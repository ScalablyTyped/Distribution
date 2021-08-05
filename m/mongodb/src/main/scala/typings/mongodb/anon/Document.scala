package typings.mongodb.anon

import typings.mongodb.mod.OptionalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document[TSchema] extends StObject {
  
  var document: OptionalId[TSchema]
}
object Document {
  
  inline def apply[TSchema](document: OptionalId[TSchema]): Document[TSchema] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TSchema]]
  }
  
  extension [Self <: Document[?], TSchema](x: Self & Document[TSchema]) {
    
    inline def setDocument(value: OptionalId[TSchema]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
