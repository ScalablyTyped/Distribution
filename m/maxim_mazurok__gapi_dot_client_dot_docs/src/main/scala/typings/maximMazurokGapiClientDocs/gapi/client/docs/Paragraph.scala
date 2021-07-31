package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph extends StObject {
  
  /** The bullet for this paragraph. If not present, the paragraph does not belong to a list. */
  var bullet: js.UndefOr[Bullet] = js.undefined
  
  /** The content of the paragraph broken down into its component parts. */
  var elements: js.UndefOr[js.Array[ParagraphElement]] = js.undefined
  
  /** The style of this paragraph. */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** The IDs of the positioned objects tethered to this paragraph. */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested changes to this paragraph's bullet. */
  var suggestedBulletChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedBullet}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
  ] = js.undefined
  
  /** The suggested paragraph style changes to this paragraph, keyed by suggestion ID. */
  var suggestedParagraphStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedParagraphStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
  ] = js.undefined
  
  /** The IDs of the positioned objects that are suggested to be attached to this paragraph, keyed by suggestion ID. */
  var suggestedPositionedObjectIds: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.ObjectReferences}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
  ] = js.undefined
}
object Paragraph {
  
  @scala.inline
  def apply(): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    @scala.inline
    def setElements(value: js.Array[ParagraphElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: ParagraphElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setPositionedObjectIds(value: js.Array[String]): Self = StObject.set(x, "positionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionedObjectIdsUndefined: Self = StObject.set(x, "positionedObjectIds", js.undefined)
    
    @scala.inline
    def setPositionedObjectIdsVarargs(value: String*): Self = StObject.set(x, "positionedObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedBulletChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedBullet}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedBulletChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedBulletChangesUndefined: Self = StObject.set(x, "suggestedBulletChanges", js.undefined)
    
    @scala.inline
    def setSuggestedParagraphStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedParagraphStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedParagraphStyleChangesUndefined: Self = StObject.set(x, "suggestedParagraphStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectIds(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.ObjectReferences}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Paragraph & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedPositionedObjectIdsUndefined: Self = StObject.set(x, "suggestedPositionedObjectIds", js.undefined)
  }
}
