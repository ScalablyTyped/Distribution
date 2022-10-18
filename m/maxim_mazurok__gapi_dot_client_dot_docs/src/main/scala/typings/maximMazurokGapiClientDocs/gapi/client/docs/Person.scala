package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person extends StObject {
  
  /** Output only. The unique ID of this link. */
  var personId: js.UndefOr[String] = js.undefined
  
  /** Output only. The properties of this Person. This field is always present. */
  var personProperties: js.UndefOr[PersonProperties] = js.undefined
  
  /**
    * IDs for suggestions that remove this person link from the document. A Person might have multiple deletion IDs if, for example, multiple users suggest to delete it. If empty, then
    * this person link isn't suggested for deletion.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IDs for suggestions that insert this person link into the document. A Person might have multiple insertion IDs if it is a nested suggested change (a suggestion within a suggestion
    * made by a different user, for example). If empty, then this person link isn't a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested text style changes to this Person, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle} */ js.Any
  ] = js.undefined
  
  /** The text style of this Person. */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object Person {
  
  inline def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  extension [Self <: Person](x: Self) {
    
    inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    
    inline def setPersonIdUndefined: Self = StObject.set(x, "personId", js.undefined)
    
    inline def setPersonProperties(value: PersonProperties): Self = StObject.set(x, "personProperties", value.asInstanceOf[js.Any])
    
    inline def setPersonPropertiesUndefined: Self = StObject.set(x, "personProperties", js.undefined)
    
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
