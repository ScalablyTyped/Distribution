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
trait DocumentPropertiesLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the creation date of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the last author of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: js.UndefOr[Boolean] = js.undefined
}

object DocumentPropertiesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    author: js.UndefOr[Boolean] = js.undefined,
    category: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    company: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    keywords: js.UndefOr[Boolean] = js.undefined,
    lastAuthor: js.UndefOr[Boolean] = js.undefined,
    manager: js.UndefOr[Boolean] = js.undefined,
    revisionNumber: js.UndefOr[Boolean] = js.undefined,
    subject: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author.get.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(company)) __obj.updateDynamic("company")(company.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastAuthor)) __obj.updateDynamic("lastAuthor")(lastAuthor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manager)) __obj.updateDynamic("manager")(manager.get.asInstanceOf[js.Any])
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
}

