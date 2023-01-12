package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOneOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Allow driver to bypass schema validation in MongoDB 3.2 or higher. */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** Force server to assign _id values instead of driver. */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
}
object InsertOneOptions {
  
  inline def apply(): InsertOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertOneOptions] (val x: Self) extends AnyVal {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
  }
}
