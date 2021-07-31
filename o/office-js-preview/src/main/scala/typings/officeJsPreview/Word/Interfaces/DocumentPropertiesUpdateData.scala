package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentProperties object, for use in `documentProperties.set({ ... })`. */
trait DocumentPropertiesUpdateData extends StObject {
  
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[String] = js.undefined
}
object DocumentPropertiesUpdateData {
  
  @scala.inline
  def apply(): DocumentPropertiesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesUpdateData]
  }
  
  @scala.inline
  implicit class DocumentPropertiesUpdateDataMutableBuilder[Self <: DocumentPropertiesUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
