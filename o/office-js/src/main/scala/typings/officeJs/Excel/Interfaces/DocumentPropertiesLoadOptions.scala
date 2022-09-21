package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents workbook properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait DocumentPropertiesLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The author of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The category of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The comments of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The company of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the creation date of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The keywords of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the last author of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The manager of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the revision number of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The subject of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
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
    
    inline def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLastAuthor(value: Boolean): Self = StObject.set(x, "lastAuthor", value.asInstanceOf[js.Any])
    
    inline def setLastAuthorUndefined: Self = StObject.set(x, "lastAuthor", js.undefined)
    
    inline def setManager(value: Boolean): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setRevisionNumber(value: Boolean): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
