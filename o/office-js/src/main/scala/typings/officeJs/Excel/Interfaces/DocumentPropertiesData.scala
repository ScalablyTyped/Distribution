package typings.officeJs.Excel.Interfaces

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentProperties.toJSON()`. */
trait DocumentPropertiesData extends StObject {
  
  /**
    *
    * The author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the creation date of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Gets the collection of custom properties of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var custom: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
  
  /**
    *
    * The keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the last author of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lastAuthor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * The subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: js.UndefOr[String] = js.undefined
}
object DocumentPropertiesData {
  
  @scala.inline
  def apply(): DocumentPropertiesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesData]
  }
  
  @scala.inline
  implicit class DocumentPropertiesDataMutableBuilder[Self <: DocumentPropertiesData] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Array[CustomPropertyData]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setCustomVarargs(value: CustomPropertyData*): Self = StObject.set(x, "custom", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLastAuthor(value: String): Self = StObject.set(x, "lastAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthorUndefined: Self = StObject.set(x, "lastAuthor", js.undefined)
    
    @scala.inline
    def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Double): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
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
