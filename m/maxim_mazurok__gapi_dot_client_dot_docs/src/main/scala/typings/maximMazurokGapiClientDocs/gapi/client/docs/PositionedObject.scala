package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedObject extends StObject {
  
  /** The ID of this positioned object. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The properties of this positioned object. */
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  /** The suggested changes to the positioned object properties, keyed by suggestion ID. */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedPositionedObjectProperties}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.PositionedObject with TopLevel[js.Any]
  ] = js.native
}
object PositionedObject {
  
  @scala.inline
  def apply(): PositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObject]
  }
  
  @scala.inline
  implicit class PositionedObjectMutableBuilder[Self <: PositionedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPositionedObjectProperties(value: PositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedPositionedObjectProperties}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.PositionedObject with TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
}
