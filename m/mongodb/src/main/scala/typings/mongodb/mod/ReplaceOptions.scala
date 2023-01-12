package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOptions
  extends StObject
     with CommandOperationOptions {
  
  /** If true, allows the write to opt-out of document level validation */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** Specify that the update query should only consider plans using the hinted index */
  var hint: js.UndefOr[String | Document] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  /** When true, creates a new document if no document matches the query */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object ReplaceOptions {
  
  inline def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setHint(value: String | Document): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
