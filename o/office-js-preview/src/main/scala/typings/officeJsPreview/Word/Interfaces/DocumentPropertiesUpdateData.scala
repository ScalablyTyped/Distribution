package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentProperties object, for use in `documentProperties.set({ ... })`. */
trait DocumentPropertiesUpdateData extends StObject {
  
  /**
    * Gets or sets the author of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the category of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the comments of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the company of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the format of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the keywords of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the manager of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the subject of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the title of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[String] = js.undefined
}
object DocumentPropertiesUpdateData {
  
  inline def apply(): DocumentPropertiesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesUpdateData]
  }
  
  extension [Self <: DocumentPropertiesUpdateData](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
