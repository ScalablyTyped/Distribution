package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents document properties.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
trait DocumentPropertiesLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the application name of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var applicationName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the author of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the category of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the comments of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the company of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the creation date of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the format of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the keywords of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the last author of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the last print date of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var lastPrintDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the last save time of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var lastSaveTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the manager of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the revision number of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets security settings of the document. Some are access restrictions on the file on disk. Others are Document Protection settings. Some possible values are 0 = File on disk is read/write; 1 = Protect Document: File is encrypted and requires a password to open; 2 = Protect Document: Always Open as Read-Only; 3 = Protect Document: Both #1 and #2; 4 = File on disk is read-only; 5 = Both #1 and #4; 6 = Both #2 and #4; 7 = All of #1, #2, and #4; 8 = Protect Document: Restrict Edit to read-only; 9 = Both #1 and #8; 10 = Both #2 and #8; 11 = All of #1, #2, and #8; 12 = Both #4 and #8; 13 = All of #1, #4, and #8; 14 = All of #2, #4, and #8; 15 = All of #1, #2, #4, and #8.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var security: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the subject of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the template of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var template: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the title of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[Boolean] = js.undefined
}
object DocumentPropertiesLoadOptions {
  
  inline def apply(): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
  
  extension [Self <: DocumentPropertiesLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setApplicationName(value: Boolean): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setAuthor(value: Boolean): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: Boolean): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCompany(value: Boolean): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCreationDate(value: Boolean): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLastAuthor(value: Boolean): Self = StObject.set(x, "lastAuthor", value.asInstanceOf[js.Any])
    
    inline def setLastAuthorUndefined: Self = StObject.set(x, "lastAuthor", js.undefined)
    
    inline def setLastPrintDate(value: Boolean): Self = StObject.set(x, "lastPrintDate", value.asInstanceOf[js.Any])
    
    inline def setLastPrintDateUndefined: Self = StObject.set(x, "lastPrintDate", js.undefined)
    
    inline def setLastSaveTime(value: Boolean): Self = StObject.set(x, "lastSaveTime", value.asInstanceOf[js.Any])
    
    inline def setLastSaveTimeUndefined: Self = StObject.set(x, "lastSaveTime", js.undefined)
    
    inline def setManager(value: Boolean): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setRevisionNumber(value: Boolean): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setSecurity(value: Boolean): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTemplate(value: Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
