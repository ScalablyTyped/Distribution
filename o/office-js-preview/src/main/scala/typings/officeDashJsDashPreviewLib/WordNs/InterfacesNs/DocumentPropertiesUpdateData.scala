package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentProperties object, for use in "documentProperties.set({ ... })". */
trait DocumentPropertiesUpdateData extends js.Object {
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
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
    format: java.lang.String = null,
    keywords: java.lang.String = null,
    manager: java.lang.String = null,
    subject: java.lang.String = null,
    title: java.lang.String = null
  ): DocumentPropertiesUpdateData = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (category != null) __obj.updateDynamic("category")(category)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (company != null) __obj.updateDynamic("company")(company)
    if (format != null) __obj.updateDynamic("format")(format)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentPropertiesUpdateData]
  }
}

