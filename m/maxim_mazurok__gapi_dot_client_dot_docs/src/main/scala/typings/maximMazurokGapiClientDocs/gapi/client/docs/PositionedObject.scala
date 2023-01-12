package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedObject extends StObject {
  
  /** The ID of this positioned object. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The properties of this positioned object. */
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
  
  /** The suggested changes to the positioned object properties, keyed by suggestion ID. */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedPositionedObjectProperties} */ js.Any
  ] = js.undefined
}
object PositionedObject {
  
  inline def apply(): PositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionedObject] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPositionedObjectProperties(value: PositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    inline def setSuggestedPositionedObjectPropertiesChanges(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedPositionedObjectProperties} */ js.Any
    ): Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedPositionedObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
}
