package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichLink extends StObject {
  
  /** Output only. The ID of this link. */
  var richLinkId: js.UndefOr[String] = js.undefined
  
  /** Output only. The properties of this RichLink. This field is always present. */
  var richLinkProperties: js.UndefOr[RichLinkProperties] = js.undefined
  
  /**
    * IDs for suggestions that remove this link from the document. A RichLink might have multiple deletion IDs if, for example, multiple users suggest to delete it. If empty, then this
    * person link isn't suggested for deletion.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IDs for suggestions that insert this link into the document. A RichLink might have multiple insertion IDs if it is a nested suggested change (a suggestion within a suggestion made
    * by a different user, for example). If empty, then this person link isn't a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested text style changes to this RichLink, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle} */ js.Any
  ] = js.undefined
  
  /** The text style of this RichLink. */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object RichLink {
  
  inline def apply(): RichLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichLink] (val x: Self) extends AnyVal {
    
    inline def setRichLinkId(value: String): Self = StObject.set(x, "richLinkId", value.asInstanceOf[js.Any])
    
    inline def setRichLinkIdUndefined: Self = StObject.set(x, "richLinkId", js.undefined)
    
    inline def setRichLinkProperties(value: RichLinkProperties): Self = StObject.set(x, "richLinkProperties", value.asInstanceOf[js.Any])
    
    inline def setRichLinkPropertiesUndefined: Self = StObject.set(x, "richLinkProperties", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
    
    inline def setSuggestedTextStyleChanges(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle} */ js.Any
    ): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
