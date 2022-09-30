package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Field
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDescription[TSchema /* <: Document */] extends StObject {
  
  /**
    * A document containing additional information about any ambiguous update paths from the update event.  The document
    * maps the full ambiguous update path to an array containing the actual resolved components of the path.  For example,
    * given a document shaped like `{ a: { '0': 0 } }`, and an update of `{ $inc: 'a.0' }`, disambiguated paths would look like
    * the following:
    *
    * ```
    *   {
    *     'a.0': ['a', '0']
    *   }
    * ```
    *
    * This field is only present when there are ambiguous paths that are updated as a part of the update event and `showExpandedEvents`
    * is enabled for the change stream.
    * @sinceServerVersion 6.1.0
    * @experimental
    */
  var disambiguatedPaths: js.UndefOr[Document] = js.undefined
  
  /**
    * An array of field names that were removed from the document.
    */
  var removedFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of documents which record array truncations performed with pipeline-based updates using one or more of the following stages:
    * - $addFields
    * - $set
    * - $replaceRoot
    * - $replaceWith
    */
  var truncatedArrays: js.UndefOr[js.Array[Field]] = js.undefined
  
  /**
    * A document containing key:value pairs of names of the fields that were
    * changed, and the new value for those fields.
    */
  var updatedFields: js.UndefOr[Partial[TSchema]] = js.undefined
}
object UpdateDescription {
  
  inline def apply[TSchema /* <: Document */](): UpdateDescription[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDescription[TSchema]]
  }
  
  extension [Self <: UpdateDescription[?], TSchema /* <: Document */](x: Self & UpdateDescription[TSchema]) {
    
    inline def setDisambiguatedPaths(value: Document): Self = StObject.set(x, "disambiguatedPaths", value.asInstanceOf[js.Any])
    
    inline def setDisambiguatedPathsUndefined: Self = StObject.set(x, "disambiguatedPaths", js.undefined)
    
    inline def setRemovedFields(value: js.Array[String]): Self = StObject.set(x, "removedFields", value.asInstanceOf[js.Any])
    
    inline def setRemovedFieldsUndefined: Self = StObject.set(x, "removedFields", js.undefined)
    
    inline def setRemovedFieldsVarargs(value: String*): Self = StObject.set(x, "removedFields", js.Array(value*))
    
    inline def setTruncatedArrays(value: js.Array[Field]): Self = StObject.set(x, "truncatedArrays", value.asInstanceOf[js.Any])
    
    inline def setTruncatedArraysUndefined: Self = StObject.set(x, "truncatedArrays", js.undefined)
    
    inline def setTruncatedArraysVarargs(value: Field*): Self = StObject.set(x, "truncatedArrays", js.Array(value*))
    
    inline def setUpdatedFields(value: Partial[TSchema]): Self = StObject.set(x, "updatedFields", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFieldsUndefined: Self = StObject.set(x, "updatedFields", js.undefined)
  }
}
