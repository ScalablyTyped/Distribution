package typings
package officeDashJsLib.ExcelNs.InterfacesNs

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
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the creation date of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var creationDate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the last author of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lastAuthor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentPropertiesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    author: js.UndefOr[scala.Boolean] = js.undefined,
    category: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.UndefOr[scala.Boolean] = js.undefined,
    company: js.UndefOr[scala.Boolean] = js.undefined,
    creationDate: js.UndefOr[scala.Boolean] = js.undefined,
    keywords: js.UndefOr[scala.Boolean] = js.undefined,
    lastAuthor: js.UndefOr[scala.Boolean] = js.undefined,
    manager: js.UndefOr[scala.Boolean] = js.undefined,
    revisionNumber: js.UndefOr[scala.Boolean] = js.undefined,
    subject: js.UndefOr[scala.Boolean] = js.undefined,
    title: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author)
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category)
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(company)) __obj.updateDynamic("company")(company)
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords)
    if (!js.isUndefined(lastAuthor)) __obj.updateDynamic("lastAuthor")(lastAuthor)
    if (!js.isUndefined(manager)) __obj.updateDynamic("manager")(manager)
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
}

