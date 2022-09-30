package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Allow driver to bypass schema validation in MongoDB 3.2 or higher. */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** Force server to assign _id values instead of driver. */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated use `ordered` instead */
  var keepGoing: js.UndefOr[Boolean] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  /** If true, when an insert fails, don't execute the remaining writes. If false, continue with remaining inserts when one fails. */
  var ordered: js.UndefOr[Boolean] = js.undefined
}
object BulkWriteOptions {
  
  inline def apply(): BulkWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOptions]
  }
  
  extension [Self <: BulkWriteOptions](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    inline def setKeepGoing(value: Boolean): Self = StObject.set(x, "keepGoing", value.asInstanceOf[js.Any])
    
    inline def setKeepGoingUndefined: Self = StObject.set(x, "keepGoing", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
  }
}
