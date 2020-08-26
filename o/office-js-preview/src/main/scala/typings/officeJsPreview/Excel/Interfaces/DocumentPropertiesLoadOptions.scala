package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents workbook properties.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait DocumentPropertiesLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * The author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[Boolean] = js.native
  /**
    *
    * The category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[Boolean] = js.native
  /**
    *
    * The comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    *
    * The company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the creation date of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var creationDate: js.UndefOr[Boolean] = js.native
  /**
    *
    * The keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the last author of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.native
  /**
    *
    * The manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.native
  /**
    *
    * The subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[Boolean] = js.native
  /**
    *
    * The title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: js.UndefOr[Boolean] = js.native
}

object DocumentPropertiesLoadOptions {
  @scala.inline
  def apply(): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
  @scala.inline
  implicit class DocumentPropertiesLoadOptionsOps[Self <: DocumentPropertiesLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAuthor(value: Boolean): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCategory(value: Boolean): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCompany(value: Boolean): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCreationDate(value: Boolean): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setKeywords(value: Boolean): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLastAuthor(value: Boolean): Self = this.set("lastAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAuthor: Self = this.set("lastAuthor", js.undefined)
    @scala.inline
    def setManager(value: Boolean): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setRevisionNumber(value: Boolean): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
    @scala.inline
    def setSubject(value: Boolean): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

