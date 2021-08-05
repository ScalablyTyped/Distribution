package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOneOptions
  extends StObject
     with CommonOptions {
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object ReplaceOneOptions {
  
  inline def apply(): ReplaceOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOneOptions]
  }
  
  extension [Self <: ReplaceOneOptions](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
