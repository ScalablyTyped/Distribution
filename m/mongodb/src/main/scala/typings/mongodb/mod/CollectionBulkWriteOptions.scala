package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBulkWriteOptions
  extends StObject
     with CommonOptions {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  //Force server to assign _id values instead of driver.
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Execute write operation in ordered or unordered fashion.
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}
object CollectionBulkWriteOptions {
  
  inline def apply(): CollectionBulkWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionBulkWriteOptions]
  }
  
  extension [Self <: CollectionBulkWriteOptions](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
  }
}
