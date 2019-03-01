package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentProperties object, for use in "documentProperties.set({ ... })". */
trait DocumentPropertiesUpdateData extends js.Object {
  /**
    *
    * Gets or sets the author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentPropertiesUpdateData {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    category: java.lang.String = null,
    comments: java.lang.String = null,
    company: java.lang.String = null,
    keywords: java.lang.String = null,
    manager: java.lang.String = null,
    revisionNumber: scala.Int | scala.Double = null,
    subject: java.lang.String = null,
    title: java.lang.String = null
  ): DocumentPropertiesUpdateData = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (category != null) __obj.updateDynamic("category")(category)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (company != null) __obj.updateDynamic("company")(company)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentPropertiesUpdateData]
  }
}

