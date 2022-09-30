package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndReplaceOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Allow driver to bypass schema validation in MongoDB 3.2 or higher. */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** An optional hint for query optimization. See the {@link https://docs.mongodb.com/manual/reference/command/update/#update-command-hint|update command} reference for more information.*/
  var hint: js.UndefOr[Document] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  /** Limits the fields to return for all matching documents. */
  var projection: js.UndefOr[Document] = js.undefined
  
  /** When set to 'after', returns the updated document rather than the original. The default is 'before'.  */
  var returnDocument: js.UndefOr[ReturnDocument] = js.undefined
  
  /** Determines which document the operation modifies if the query selects multiple documents. */
  var sort: js.UndefOr[Sort] = js.undefined
  
  /** Upsert the document if it does not exist. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object FindOneAndReplaceOptions {
  
  inline def apply(): FindOneAndReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOptions]
  }
  
  extension [Self <: FindOneAndReplaceOptions](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setHint(value: Document): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setProjection(value: Document): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setReturnDocument(value: ReturnDocument): Self = StObject.set(x, "returnDocument", value.asInstanceOf[js.Any])
    
    inline def setReturnDocumentUndefined: Self = StObject.set(x, "returnDocument", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (String | (js.Tuple2[String, SortDirection]))*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
