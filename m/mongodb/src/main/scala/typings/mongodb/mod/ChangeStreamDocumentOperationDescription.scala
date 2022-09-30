package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDocumentOperationDescription extends StObject {
  
  /**
    * An description of the operation.
    *
    * Only present when the `showExpandedEvents` flag is enabled.
    *
    * @sinceServerVersion 6.1.0
    */
  var operationDescription: js.UndefOr[Document] = js.undefined
}
object ChangeStreamDocumentOperationDescription {
  
  inline def apply(): ChangeStreamDocumentOperationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamDocumentOperationDescription]
  }
  
  extension [Self <: ChangeStreamDocumentOperationDescription](x: Self) {
    
    inline def setOperationDescription(value: Document): Self = StObject.set(x, "operationDescription", value.asInstanceOf[js.Any])
    
    inline def setOperationDescriptionUndefined: Self = StObject.set(x, "operationDescription", js.undefined)
  }
}
